package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d13_find_first_last_position_element_sort_array;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D13
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-36
 * @Version 1.0
 **/
public class BinarySearchS13D13 {

    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
