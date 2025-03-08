package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d2_Reverse_ThreeBit_Integer
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 14:08
 * @Author:NieZheng
 * @Version:1.0
 */
public class d2_Reverse_ThreeBit_Integer {

    // 方式一：利用StringBuilder
    public static int reverseThreeBitInteger(int number){
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    // 方式二：运算符节
    public static int reverseThreeBitInteger2(int number){
        // 获取个位数
        int num1 = number % 10;
        // 获取十位数
        int num2 = (number / 10) % 10;
        // 获得百位数
        int num3 =  ( (number  / 10 ) / 10) % 10;
        // 相加
        return num3 + num2 * 10  + num1 * 100;
    }

    public static void main(String[] args){
        int result = reverseThreeBitInteger2(123);
        System.out.println(result);
    }



}
