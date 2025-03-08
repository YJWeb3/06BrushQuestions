package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d5_missing_positive_number;

/**
 * @program: StructAlgorithm
 * @ClassName DisplaceS1D5
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-06
 * @Version 1.0
 **/
public class DisplaceS2D5 {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // 第i位存放i+1的数值
        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
