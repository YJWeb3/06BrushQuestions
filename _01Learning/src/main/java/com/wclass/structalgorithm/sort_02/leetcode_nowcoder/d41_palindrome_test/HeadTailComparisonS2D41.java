package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d41_palindrome_test;

/**
 * @program: StructAlgorithm
 * @ClassName HeadTailComparisonS2D41
 * @description:
 * @author: W哥
 * @create: 2024-09-19-20-51
 * @Version 1.0
 **/
public class HeadTailComparisonS2D41 {

    public boolean judge (String str) {
        //首指针
        int left = 0;
        //尾指针
        int right = str.length() - 1;
        //首尾往中间靠
        while(left < right){
            //比较前后是否相同
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}
