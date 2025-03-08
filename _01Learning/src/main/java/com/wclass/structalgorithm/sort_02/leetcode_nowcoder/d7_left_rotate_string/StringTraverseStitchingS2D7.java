package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d7_left_rotate_string;

/**
 * @program: StructAlgorithm
 * @ClassName StringTraverseStitchingS1D7
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-13
 * @Version 1.0
 **/
public class StringTraverseStitchingS2D7 {

    public String reverseLeftWords(String s, int n) {
        String res = "";
        for(int i = n; i < s.length(); i++)
            res += s.charAt(i);
        for(int i = 0; i < n; i++)
            res += s.charAt(i);
        return res;
    }

}
