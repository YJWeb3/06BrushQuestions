package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d15_find_min_value_rotated_sorted_array;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D15
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-38
 * @Version 1.0
 **/
public class BinarySearchS13D15 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }

}
