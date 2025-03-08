package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d32_longest_increasing_subsequence;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D32
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-13
 * @Version 1.0
 **/
public class DynamicProgrammingS14D32 {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

}
