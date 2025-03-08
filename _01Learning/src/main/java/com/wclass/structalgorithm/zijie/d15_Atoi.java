package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d15_Atoi
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 14:36
 * @Author:NieZheng
 * @Version:1.0
 */
public class d15_Atoi {

    public static int atoi(String str){
        if (str == null){
            return 0;
        }
        str = str.trim();
        if (str.length() == 0){
            return 0;
        }
        int sign = 1;
        int index = 0;

        if (str.charAt(index) == '+'){
            index++;
        }else if (str.charAt(index) == '-'){
            sign = -1;
            index++;
        }
        long num = 0;
        for(;index < str.length();index++){
            if (str.charAt(index) < '0' || str.charAt(index) > '9')
                break;
            num = num * 10 + (str.charAt(index) - '0');
            if (num > Integer.MAX_VALUE){
                break;
            }
        }
        if (num * sign >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (num*sign <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)num * sign;
    }

    public static void main(String[] args) {
        System.out.println(atoi("1.0"));
        System.out.println(atoi("1111111111111111111111111111"));
    }
}
