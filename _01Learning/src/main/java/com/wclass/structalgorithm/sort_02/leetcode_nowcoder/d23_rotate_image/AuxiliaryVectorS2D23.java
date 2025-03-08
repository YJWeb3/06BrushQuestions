package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d23_rotate_image;

/**
 * @program: StructAlgorithm
 * @ClassName AuxiliaryVectorS1D23
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-06
 * @Version 1.0
 **/
public class AuxiliaryVectorS2D23 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }

}
