package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d13_reverseString2
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 13:14
 * @Author:NieZheng
 * @Version:1.0
 */
public class d13_reverseString2 {

    public static String reverseString2(String s,int k){
        String ans = new String("");
        int l = s.length();
        int i,j;
        for (i = 0; i < l; i += 2 * k) {
            for(j = Math.min(l - 1,i + k - 1);j >= i;j--)
                ans = ans + s.charAt(j);
            for (j = i + k;j < Math.min(i + 2 * k,l);j++)
                ans = ans + s.charAt(j);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseString2("abcdefg",2));
    }
}
