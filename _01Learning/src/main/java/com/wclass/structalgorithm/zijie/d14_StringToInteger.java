package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d14_StringToInteger
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 14:20
 * @Author:NieZheng
 * @Version:1.0
 */
public class d14_StringToInteger {

    public static int stringToInteger(String str){
        return Integer.valueOf(str);
    }

    public static int stringToInteger2(String str){
        int integer = 0;
        int Minus = 0;
        if (str.charAt(0) == '-'){
            Minus = 1;
        }
        for (int i = Minus; i < str.length(); i++) {
            integer = integer * 10 + str.charAt(i) - '0';
        }
        if (Minus == 1){
            integer = -integer;
        }
        return integer;
    }

    public static void main(String[] args) {
        System.out.println(stringToInteger("123") == 123);
        System.out.println(stringToInteger("123") == 123);
    }
}
