package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d19_house_robbery_I;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D19
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-29
 * @Version 1.0
 **/
public class DynamicProgrammingS14D19 {

    public int rob (int[] nums) {
        //dp[i]表示长度为i的数组，最多能偷取多少钱
        int[] dp = new int[nums.length + 1];
        //长度为1只能偷第一家
        dp[1] = nums[0];
        for(int i = 2; i <= nums.length; i++)
            //对于每家可以选择偷或者不偷
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
        return dp[nums.length];
    }

}
