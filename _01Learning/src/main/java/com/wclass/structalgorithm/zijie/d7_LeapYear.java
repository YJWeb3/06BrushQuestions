package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d7_LeapYear
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 15:29
 * @Author:NieZheng
 * @Version:1.0
 */
public class d7_LeapYear {
    public static boolean isLeapYear(int n){
        return (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0));
    }

    public static void main(String[] args){
        boolean result = isLeapYear(2008);
        System.out.println(result);
    }
}
