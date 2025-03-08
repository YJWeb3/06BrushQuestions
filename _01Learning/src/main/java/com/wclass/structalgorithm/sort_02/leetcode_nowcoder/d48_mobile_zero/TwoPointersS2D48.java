package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d48_mobile_zero;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D48
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-07
 * @Version 1.0
 **/
public class TwoPointersS2D48 {

    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
