package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d11_equal_row_column_pairs;

/**
 * @program: StructAlgorithm
 * @ClassName SimulationS9D11
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-18
 * @Version 1.0
 **/
public class SimulationS9D11 {

    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (equal(row, col, n, grid)) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean equal(int row, int col, int n, int[][] grid) {
        for (int i = 0; i < n; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }

}
