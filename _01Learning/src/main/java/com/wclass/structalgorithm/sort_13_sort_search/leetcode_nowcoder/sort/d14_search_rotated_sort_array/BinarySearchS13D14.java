package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d14_search_rotated_sort_array;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D14
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-37
 * @Version 1.0
 **/
public class BinarySearchS13D14 {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

}
