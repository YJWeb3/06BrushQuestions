package com.wclass.brush.d2_dynamic.d1_base.d2_longest_common_subsequence;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo03DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-13
 * @Version 1.0
 **/
public class Demo03DynamicProgram {

    //测试：
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            char[] chars1 = line1.toCharArray();
            char[] chars2 = line2.toCharArray();
            System.out.println(lcsLength(chars1, chars2));
        }

    }

    public static int lcsLength(char[] x,char[] y){
        int m = x.length;
        int n = y.length;
        //要填的表
        int[][] p = new int[m+1][n+1];
        //表的第1行和第一列全部为0
        for (int i = 0; i <= m; i++) {
            p[i][0]=0;
        }
        for (int i = 0; i <= n; i++) {
            p[0][i]=0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i-1]==y[j-1]){
                    p[i][j] = p[i-1][j-1]+1;
                }else {
                    p[i][j] = Math.max(p[i-1][j],p[i][j-1]);
                }
            }
        }

        return p[m][n];
    }

}