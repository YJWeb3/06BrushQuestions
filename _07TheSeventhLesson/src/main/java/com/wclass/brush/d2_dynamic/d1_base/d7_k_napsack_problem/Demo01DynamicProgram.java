package com.wclass.brush.d2_dynamic.d1_base.d7_k_napsack_problem;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-25
 * @Version 1.0
 **/
public class Demo01DynamicProgram {


    public static void main(String[] args) {
        //浪费数组的第一个
        int[] w = {0,2, 2, 6, 5, 4};
        int[] v = {0,6, 3, 5, 4, 6};

        System.out.println(fun(5, 10, v, w));

    }


    public static int fun(int n,int c,int[] v,int[] w){
        int[][] m = new int[n+1][c+1];
        //防止数组越界
        int jMax = Math.min(w[n]-1,c);

        //Step1:填最后一行

        //j<w[n] ==>m[n][j]=0
        for (int j = 0; j <= jMax; j++) {
            m[n][j] = 0;
        }
        //j>=w[n] ==>m[n][j]=v[n]
        for (int j = w[n]; j <= c; j++) {
            m[n][j] = v[n];
        }

        //Step2: 从倒数第二行往前面填

        for (int i = n-1; i > 1; i--) {
            jMax = Math.min(w[i]-1,c);
            for (int j = 0; j <= jMax; j++) {
                m[i][j] = m[i+1][j];
            }

            for (int j = w[i]; j <= c; j++) {
                m[i][j] = Math.max(m[i+1][j],m[i+1][j-w[i]]+v[i]);
            }

        }

        //第一行最后一个元素
        m[1][c] = m[2][c];
        if (c >= w[1]){
            m[1][c] = Math.max(m[1][c],m[2][c-w[1]]+v[1]);
        }

        return m[1][c];

    }

    //根据填的表格推断
    public static void traceback(int[][] m,int n,int c,int[] w){
        int[] x = new int[n+1];
        for (int i = 1; i < n; i++) {
            //没有选择
            if (m[i][c] == m[i+1][c] ){
                x[i] = 0;
            }else {
                x[i] = 1;
                c -= w[i];
            }
        }

        x[n] = (m[n][c]>0) ? 1:0;

        for (int i =1 ; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}