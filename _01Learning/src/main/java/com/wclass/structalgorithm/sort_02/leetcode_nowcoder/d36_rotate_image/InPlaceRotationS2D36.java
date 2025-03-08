package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d36_rotate_image;

/**
 * @program: StructAlgorithm
 * @ClassName InPlaceRotationS2D36
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-16
 * @Version 1.0
 **/
public class InPlaceRotationS2D36 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

}
