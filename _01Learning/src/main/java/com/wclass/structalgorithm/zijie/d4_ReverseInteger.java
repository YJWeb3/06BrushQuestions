package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d4_ReverseInteger
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/4 14:29
 * @Author:NieZheng
 * @Version:1.0
 */
public class d4_ReverseInteger {

    public static int reveserInteger(int num){
        int rev = 0;
        while(num != 0){
            if ( rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            int digit = num % 10;
            num /= 10;
            rev = rev * 10 + digit;
        }
       return rev;
    }
    public static void main(String[] args) {
        int result = reveserInteger(-123);
        System.out.println(result);
    }
}
