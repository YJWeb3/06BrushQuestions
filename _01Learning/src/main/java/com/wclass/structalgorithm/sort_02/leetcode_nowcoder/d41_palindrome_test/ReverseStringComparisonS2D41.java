package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d41_palindrome_test;

/**
 * @program: StructAlgorithm
 * @ClassName ReverseStringComparisonS2D41
 * @description:
 * @author: W哥
 * @create: 2024-09-19-20-52
 * @Version 1.0
 **/
public class ReverseStringComparisonS2D41 {

    public boolean judge (String str) {
        StringBuffer temp = new StringBuffer(str);
        //反转字符串
        String s = temp.reverse().toString();
        //比较字符串是否相等
        if(s.equals(str))
            return true;
        return false;
    }

}
