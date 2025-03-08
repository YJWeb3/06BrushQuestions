package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d13_max_sum_consecutive_subarrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D13
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-08
 * @Version 1.0
 **/
public class DynamicProgrammingS14D13 {

    public int FindGreatestSumOfSubArray(int[] array) {
        //记录到下标i为止的最大连续子数组和
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int maxsum = dp[0];
        for(int i = 1; i < array.length; i++){
            //状态转移：连续子数组和最大值
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
            //维护最大值
            maxsum = Math.max(maxsum, dp[i]);
        }
        return maxsum;
    }

}
