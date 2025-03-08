package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d5_missing_positive_number;

/**
 * @program: StructAlgorithm
 * @ClassName HashtableS1D5
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-06
 * @Version 1.0
 **/
public class HashtableS2D5 {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
