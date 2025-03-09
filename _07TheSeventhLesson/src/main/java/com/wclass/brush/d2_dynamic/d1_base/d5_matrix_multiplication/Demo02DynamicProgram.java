package com.wclass.brush.d2_dynamic.d1_base.d5_matrix_multiplication;

import java.util.Scanner;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo02DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-21
 * @Version 1.0
 **/
public class Demo02DynamicProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n  = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[][] ints = matrixChain(a, new int[a.length - 1][a.length - 1], new int[a.length - 1][a.length - 1]);
/*            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    System.out.print(ints[i][j]);
                }
                System.out.println();
            }*/
            traceback(ints,0,n-2);
        }
    }

    /**
     * 矩阵连乘
     * @param p 连乘矩阵
     * @param m  最小解
     * @param s 记录分割的值
     */
    public static int[][] matrixChain(int[] p,int[][] m,int[][] s){
        //矩阵个数
        int n = p.length-1;
        //i=j的情况   m[i][i]:自有一个矩阵，没有乘法
        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
            s[i][i] = 0;
        }
        //i < j的情况
        for (int i = 1; i < n; i++) {
            int k = i;
            for (int j = 0; j < n-i; j++) {
                //从j分开 m[j][j](=0)和m[j+1][k]  ,合并的乘法次数：p[j]xp[j+1]与p[j+1]xp[k+1]
                m[j][k] = m[j+1][k]+ p[j]*p[k+1]*p[j+1];
                s[j][k] = j;
                //m[j][k] 从j+1开始分开，到k-1结束
                for (int l = j+1; l < k; l++) {
                    int t = m[j][l]+m[l+1][k] +p[j]*p[k+1]*p[l+1];
                    if (t < m[j][k]){
                        m[j][k] = t;
                        s[j][k] = l;
                    }
                }
                k++;
            }

        }

        return s;
    }



    public static void traceback(int[][] s,int i,int j){
        //只有一个矩阵 ==》结束
        if (i == j){
            return;
        }
        //[i,j]是从s[i][j]分开的，写成两个部分
        traceback(s,i,s[i][j]);
        traceback(s,s[i][j]+1,j);
        //因为我们i是从0开始的，所以 i和j输出时都需要加1，分开也是从0开始，比如s[i][j]=i表示分成[i][i]和[i+1][j]
        System.out.println("A["+(i+1)+":"+(s[i][j]+1)+"] * A["+(s[i][j]+2)+":"+(j+1)+"]");
    }

}