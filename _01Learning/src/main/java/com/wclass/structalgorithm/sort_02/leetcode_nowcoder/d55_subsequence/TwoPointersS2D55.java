package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d55_subsequence;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D55
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-30
 * @Version 1.0
 **/
public class TwoPointersS2D55 {

    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }

}
