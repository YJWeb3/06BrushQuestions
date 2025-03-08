package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d55_subsequence;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS2D55
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-31
 * @Version 1.0
 **/
public class DynamicProgrammingS2D55 {

    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
