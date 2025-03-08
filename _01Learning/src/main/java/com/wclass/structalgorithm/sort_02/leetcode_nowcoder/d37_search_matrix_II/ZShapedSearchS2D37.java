package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d37_search_matrix_II;

/**
 * @program: StructAlgorithm
 * @ClassName Z_Shaped_Search
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-19
 * @Version 1.0
 **/
public class ZShapedSearchS2D37 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                --y;
            } else {
                ++x;
            }
        }
        return false;
    }

}
