package com.wclass.brush.d2_dynamic.d1_base.d5_matrix_multiplication;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-20
 * @Version 1.0
 **/
public class Demo01DynamicProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n  = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(matrixChain(a, new int[a.length-1][a.length-1]));
        }
    }

    /**
     * 矩阵连乘
     * @param p 连乘矩阵
     * @param m  最小解
     */
    public static int matrixChain(int[] p,int[][] m){
        //矩阵个数
        int n = p.length-1;
        //i=j的情况   m[i][i]:自有一个矩阵，没有乘法
        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }
        //i < j的情况
        for (int i = 1; i < n; i++) {
            int k = i;
            for (int j = 0; j < n-i; j++) {
                //从j分开 m[j][j](=0)和m[j+1][k]  ,合并的乘法次数：p[j]xp[j+1]与p[j+1]xp[k+1]
                m[j][k] = m[j+1][k]+ p[j]*p[k+1]*p[j+1];
                //m[j][k] 从j+1开始分开，到k-1结束，选出乘法次数最少的
                for (int l = j+1; l < k; l++) {
                    int t = m[j][l]+m[l+1][k] +p[j]*p[k+1]*p[l+1];
                    if (t < m[j][k]){
                        m[j][k] = t;
                    }
                }
                k++;
            }

        }
        //m[0][n-1]:第一个矩阵到第n个矩阵连乘的最少次数
        return m[0][n-1];
    }

}