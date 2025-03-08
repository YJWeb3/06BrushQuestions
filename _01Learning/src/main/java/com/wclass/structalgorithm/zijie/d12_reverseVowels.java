package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d12_reverseVowels
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/5 13:01
 * @Author:NieZheng
 * @Version:1.0
 */
public class d12_reverseVowels {

    public static String  reverseVowels(String s){
        if ( s == null || s.length() == 0)
            return s;
        String vowels = "aeiouAEIOU";
        char[] chars =s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while ( start < end ){
            while (start < end && !vowels.contains(chars[start] + "")){
                start++;
            }
            while (start < end && !vowels.contains(chars[end] + "")){
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args){
        System.out.println(reverseVowels("lintcode"));
    }
}
