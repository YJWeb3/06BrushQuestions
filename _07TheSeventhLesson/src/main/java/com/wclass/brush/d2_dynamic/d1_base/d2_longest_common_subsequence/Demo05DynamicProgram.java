package com.wclass.brush.d2_dynamic.d1_base.d2_longest_common_subsequence;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo05DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-14
 * @Version 1.0
 **/
public class Demo05DynamicProgram {
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
        int[][] p = new int[2][Math.min(m,n)+1];
        //表的第1行和第一列全部为0
        for (int i = 0; i <= 1; i++) {
            p[i][0]=0;
        }
        for (int i = 0; i < Math.min(m,n); i++) {
            p[0][i]=0;
        }
        int flag = 0;
        for (int i = 1; i <= Math.max(m,n); i++) {
            flag = 1 - flag;
            for (int j = 1; j <= Math.min(m,n); j++) {
                if (x[i-1]==y[j-1]){
                    p[flag][j] = p[1-flag][j-1]+1;
                }else {
                    p[flag][j] = Math.max(p[1-flag][j],p[flag][j-1]);
                }
            }
        }

        return p[flag][Math.min(m,n)];
    }

}