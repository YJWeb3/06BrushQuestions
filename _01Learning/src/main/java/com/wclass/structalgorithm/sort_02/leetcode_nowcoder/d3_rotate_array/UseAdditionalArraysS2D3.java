package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d3_rotate_array;

/**
 * @program: StructAlgorithm
 * @ClassName UseAdditionalArraysS2D3
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-58
 * @Version 1.0
 **/
public class UseAdditionalArraysS2D3 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }

}
