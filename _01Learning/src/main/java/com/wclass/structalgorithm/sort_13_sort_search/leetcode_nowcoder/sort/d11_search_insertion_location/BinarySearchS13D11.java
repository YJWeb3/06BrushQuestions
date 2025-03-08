package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d11_search_insertion_location;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D11
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-32
 * @Version 1.0
 **/
public class BinarySearchS13D11 {

    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
