package com.wclass.brush.d2_dynamic.d1_base.d3_largest_sub_segment_sum;

/**
 * @program: 06BrushQuestions
 * @ClassName Demo01DynamicProgram
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-16
 * @Version 1.0
 **/
public class Demo01DynamicProgram {

    public static void main(String[] args) {
        int[] a = {-2,11,-4,13,-5,-2};
        System.out.println(solve(a));
    }

    public static int solve(int[] a){

        int[] p = new int[a.length];
        //以第一个结尾
        p[0] = a[0];
        int max = p[0];
        for (int i = 1; i < a.length; i++) {
            //从第二个开始
            if (p[i-1] > 0){
                p[i] = a[i] +p[i-1];
            }else {
                p[i] = a[i];
            }

            if (p[i] > max){
                max = p[i];
            }
        }

        return max;
    }

}