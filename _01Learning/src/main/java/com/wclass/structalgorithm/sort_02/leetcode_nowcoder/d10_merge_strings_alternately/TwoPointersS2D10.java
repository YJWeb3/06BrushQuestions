package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d10_merge_strings_alternately;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS1D10
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-28
 * @Version 1.0
 **/
public class TwoPointersS2D10 {

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;

        StringBuilder ans = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                ans.append(word1.charAt(i));
                ++i;
            }
            if (j < n) {
                ans.append(word2.charAt(j));
                ++j;
            }
        }
        return ans.toString();
    }

}
