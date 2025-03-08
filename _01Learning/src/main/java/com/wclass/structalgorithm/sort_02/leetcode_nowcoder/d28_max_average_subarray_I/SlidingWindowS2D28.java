package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d28_max_average_subarray_I;

/**
 * @program: StructAlgorithm
 * @ClassName SlidingWindowS1D28
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-26
 * @Version 1.0
 **/
public class SlidingWindowS2D28 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }

}
