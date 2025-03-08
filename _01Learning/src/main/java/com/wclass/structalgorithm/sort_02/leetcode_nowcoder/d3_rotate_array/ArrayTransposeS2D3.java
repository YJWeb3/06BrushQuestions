package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d3_rotate_array;

/**
 * @program: StructAlgorithm
 * @ClassName ArrayTransposeS2D3
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-00
 * @Version 1.0
 **/
public class ArrayTransposeS2D3 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

}
