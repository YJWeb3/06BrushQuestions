package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d38_jewelry_highest_value;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D38
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-24
 * @Version 1.0
 **/
public class DynamicProgrammingS14D38 {

    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i > 0) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j]);
                }
                if (j > 0) {
                    f[i][j] = Math.max(f[i][j], f[i][j - 1]);
                }
                f[i][j] += grid[i][j];
            }
        }
        return f[m - 1][n - 1];
    }

    public int maxValue02(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] f = new int[2][n];
        for (int i = 0; i < m; ++i) {
            int pos = i % 2;
            for (int j = 0; j < n; ++j) {
                f[pos][j] = 0;
                if (i > 0) {
                    f[pos][j] = Math.max(f[pos][j], f[1 - pos][j]);
                }
                if (j > 0) {
                    f[pos][j] = Math.max(f[pos][j], f[pos][j - 1]);
                }
                f[pos][j] += grid[i][j];
            }
        }
        return f[(m - 1) % 2][n - 1];
    }
}
