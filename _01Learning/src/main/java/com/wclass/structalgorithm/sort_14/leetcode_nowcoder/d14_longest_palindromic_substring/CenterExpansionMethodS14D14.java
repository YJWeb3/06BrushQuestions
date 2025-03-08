package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d14_longest_palindromic_substring;

/**
 * @program: StructAlgorithm
 * @ClassName CenterExpansionMethodS14D14
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-10
 * @Version 1.0
 **/
public class CenterExpansionMethodS14D14 {

    public int fun(String s, int begin, int end){
        //每个中心点开始扩展
        while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
        }
        //返回长度
        return end - begin - 1;
    }
    public int getLongestPalindrome (String A) {
        int maxlen = 1;
        //以每个点为中心
        for(int i = 0; i < A.length() - 1; i++)
            //分奇数长度和偶数长度向两边扩展
            maxlen = Math.max(maxlen, Math.max(fun(A, i, i), fun(A, i, i + 1)));
        return maxlen;
    }

}
