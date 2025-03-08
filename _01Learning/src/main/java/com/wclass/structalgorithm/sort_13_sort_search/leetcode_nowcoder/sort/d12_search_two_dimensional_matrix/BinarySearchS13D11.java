package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d12_search_two_dimensional_matrix;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D11
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-34
 * @Version 1.0
 **/
public class BinarySearchS13D11 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
