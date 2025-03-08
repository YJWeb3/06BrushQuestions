package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d37_search_matrix_II;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS2D37
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-18
 * @Version 1.0
 **/
public class BinarySearchS2D37 {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int index = search(row, target);
            if (index >= 0) {
                return true;
            }
        }
        return false;
    }

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
