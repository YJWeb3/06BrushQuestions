package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d37_search_matrix_II;

/**
 * @program: StructAlgorithm
 * @ClassName DirectlySearchS2D37
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-18
 * @Version 1.0
 **/
public class DirectlySearchS2D37 {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

}
