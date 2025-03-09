package com.wclass.brush.d2_dynamic.d1_base.d4_longest_common_substring;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo03DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-19
 * @Version 1.0
 **/
public class Demo03DynamicProgram {

    public static void main(String[] args) {
        String x = "acbcbcef";
        String y = "abcbced";
        System.out.println(LCS(x, y));
    }

    public static int LCS(String x,String y){
        char[] a = x.toCharArray();
        char[] b = y.toCharArray();
        int m = a.length;
        int n = b.length;
        int max = 0;
        int index = 0;
        int[][] p = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            p[i][0] = 0;
        }

        for (int i = 0; i <= n; i++) {
            p[0][n] = 0;
        }


        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (a[i-1]==b[j-1]){
                    p[i][j] = p[i-1][j-1]+1;

                    if (p[i][j] > max){
                        max = p[i][j];
                        index = i;
                    }
                }else {
                    p[i][j] = 0;
                }
            }
        }

        for (int i = max; i > 0; i--) {
            System.out.print(a[index-i]);
        }
        System.out.println();
        return max;
    }

}