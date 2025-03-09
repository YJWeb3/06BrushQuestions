package com.wclass.brush.d2_dynamic.d1_base.d1_triangle;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01Recursion
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-07
 * @Version 1.0
 **/
public class Demo01Recursion {

    public static void main(String[] args) {
        int[][] a = {{1},{3,2},{4,10,1},{4,3,2,20}};
        System.out.println(solve(a,0,0));

    }



    public static int solve(int[][] a,int i,int j){

        //第 n+1 层结束  ===》从0层开始计算 ，那么 i = n 时结束
        if (i == a.length){
            return 0;
        }


        return a[i][j]+ Math.max(solve(a,i+1,j),solve(a,i+1,j+1));
    }

}