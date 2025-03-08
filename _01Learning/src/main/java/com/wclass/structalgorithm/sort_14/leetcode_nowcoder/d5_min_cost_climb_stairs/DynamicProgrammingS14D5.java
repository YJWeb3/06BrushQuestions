package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d5_min_cost_climb_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D5
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-46
 * @Version 1.0
 **/
public class DynamicProgrammingS14D5 {

    public int minCostClimbingStairs (int[] cost) {
        //dp[i]表示爬到第i阶楼梯需要的最小花费
        int[] dp = new int[cost.length + 1];
        for(int i = 2; i <= cost.length; i++)
            //每次选取最小的方案
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        return dp[cost.length];
    }

}
