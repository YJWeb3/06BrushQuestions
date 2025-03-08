package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d45_different_paths;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D45
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-16
 * @Version 1.0
 **/
public class DynamicProgrammingS14D45 {

    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }

    public int uniquePaths02(int m, int n) {
        int[] f = new int[n];
        for (int i = 0; i < n; ++i) {
            f[i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[j] += f[j - 1];
            }
        }
        return f[n - 1];
    }
}
