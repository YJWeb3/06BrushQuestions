package com.wclass.brush.d2_dynamic.d1_base.d1_triangle;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo03DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-09
 * @Version 1.0
 **/
public class Demo03DynamicProgram {

    public static void main(String[] args) {

        int[][] a = {{1},{3,2},{4,10,1},{4,3,2,20}};
        System.out.println(solve(a));

    }

    public static int solve(int[][] a){
        int[][] p = a.clone();
        //最后一层的数不需要修改 ，从倒数第二次开始
        for (int i = a.length -2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                p[i][j] = a[i][j] + Math.max(p[i+1][j],p[i+1][j+1]);
            }
        }


        return p[0][0];
    }

}