package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d5_EffectiveTriangle
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 14:42
 * @Author:NieZheng
 * @Version:1.0
 */
public class d5_ValidTriangle {

    public static boolean isValidTriangle(int a,int b,int c){
        return (a + b > c && a + c > b && b + c > a);
    }

    public static void main(String[] args) {
        boolean result = isValidTriangle(2,3,4);
        System.out.println(result);
    }
}
