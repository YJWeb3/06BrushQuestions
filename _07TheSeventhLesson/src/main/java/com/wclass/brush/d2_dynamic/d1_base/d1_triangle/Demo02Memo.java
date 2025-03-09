package com.wclass.brush.d2_dynamic.d1_base.d1_triangle;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo02Memo
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-08
 * @Version 1.0
 **/
public class Demo02Memo {
    public static void main(String[] args) {

        int[][] a = {{1},{3,2},{4,10,1},{4,3,2,20}};
        System.out.println(solve(a,0,0,new int[a.length][a.length]));

    }

    public static int solve(int[][] a,int i,int j,int[][] p){

        //第 n+1 层结束  ===》从0层开始计算 ，那么 i = n 时结束
        if (i == a.length){
            return 0;
        }


        if (p[i][j] == 0) {
            p[i][j] = a[i][j] + Math.max(solve(a, i + 1, j, p), solve(a, i + 1, j + 1, p));

        }
        return p[i][j];

    }
}