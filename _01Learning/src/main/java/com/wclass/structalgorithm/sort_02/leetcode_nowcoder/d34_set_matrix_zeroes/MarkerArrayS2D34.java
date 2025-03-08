package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d34_set_matrix_zeroes;

/**
 * @program: StructAlgorithm
 * @ClassName UseTagArrayS2D34
 * @description:
 * @author: W哥
 * @create: 2024-09-17-19-59
 * @Version 1.0
 **/
public class MarkerArrayS2D34 {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
