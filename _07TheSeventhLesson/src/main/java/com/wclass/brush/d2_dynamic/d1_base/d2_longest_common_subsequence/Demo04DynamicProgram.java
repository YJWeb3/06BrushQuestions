package com.wclass.brush.d2_dynamic.d1_base.d2_longest_common_subsequence;

import java.util.Scanner;
/**
 * @program: 06BrushQuestions
 * @ClassName Demo04DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-13
 * @Version 1.0
 **/
public class Demo04DynamicProgram {

    //测试：
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            char[] chars1 = line1.toCharArray();
            char[] chars2 = line2.toCharArray();
            int[][] b = lcsLength(chars1, chars2, new int[chars1.length + 1][chars2.length + 1]);
            printlcs(chars1.length ,chars2.length ,chars1,b);
            System.out.println();
        }

    }

    public static int[][] lcsLength(char[] x,char[] y,int[][] b){
        int m = x.length;
        int n = y.length;
        int[][] p = new int[m+1][n+1];
        for (int i = 0; i <= n; i++) {
            p[0][i] = 0;
        }
        for (int i = 0; i <= m; i++) {
            p[i][0] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i-1]==y[j-1]){
                    b[i][j] = 1;
                    p[i][j] = p[i-1][j-1]+1;
                }else if (p[i-1][j]>=p[i][j-1]){
                    b[i][j] = 2;
                    p[i][j] = p[i-1][j];
                }else {
                    b[i][j] = 3;
                    p[i][j] = p[i][j-1];
                }
            }
        }
        return b;

    }

    public static void printlcs(int i,int j, char[]a,int [][]drection) {
        if(i==0||j==0) {
            return;
        }
        if(drection[i][j]==1) {
            //下面两句代码的位置不能调换，调换就相当于逆序输出，全部递归完后，从第一个开始输出
            printlcs(i-1,j-1,a,drection);
            System.out.print(a[i-1]);
        }
        else if(drection[i][j]==2) {
            printlcs(i-1,j,a,drection);
        }else {
            printlcs(i,j-1,a,drection);
        }

    }

}