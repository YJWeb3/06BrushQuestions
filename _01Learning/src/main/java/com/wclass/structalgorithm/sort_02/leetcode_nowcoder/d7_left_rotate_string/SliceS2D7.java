package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d7_left_rotate_string;

/**
 * @program: StructAlgorithm
 * @ClassName sliceS1D7
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-11
 * @Version 1.0
 **/
public class SliceS2D7 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

}
