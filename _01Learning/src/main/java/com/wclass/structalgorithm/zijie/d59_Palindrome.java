package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d59_Palindrome
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 13:46
 * @Author:NieZheng
 * @Version:1.0
 */
public class d59_Palindrome {

    public boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        return x == reverse(x);
    }

    private int reverse(int x) {
        int rst = 0;
        while(x != 0){
            rst = rst * 10 + x % 10;
            x = x / 10;
        }
        return rst;
    }
}
