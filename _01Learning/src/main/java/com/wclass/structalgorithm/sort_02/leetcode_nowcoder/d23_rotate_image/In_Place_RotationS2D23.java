package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d23_rotate_image;

/**
 * @program: StructAlgorithm
 * @ClassName In_Place_Rotation
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-07
 * @Version 1.0
 **/
public class In_Place_RotationS2D23 {

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
