package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d43_kth_largest_element_array‌;

/**
 * @program: StructAlgorithm
 * @ClassName QuickSortSelectS6D43
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-36
 * @Version 1.0
 **/
public class QuickSortSelectS6D43 {

    int quickselect(int[] nums, int l, int r, int k) {
        if (l == r) return nums[k];
        int x = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < x);
            do j--; while (nums[j] > x);
            if (i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        if (k <= j) return quickselect(nums, l, j, k);
        else return quickselect(nums, j + 1, r, k);
    }
    public int findKthLargest(int[] _nums, int k) {
        int n = _nums.length;
        return quickselect(_nums, 0, n - 1, n - k);
    }

}
