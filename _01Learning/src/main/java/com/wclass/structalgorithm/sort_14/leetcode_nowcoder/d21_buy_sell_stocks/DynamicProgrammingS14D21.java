package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d21_buy_sell_stocks;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D21
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-32
 * @Version 1.0
 **/
public class DynamicProgrammingS14D21 {

    public int maxProfit (int[] prices) {
        int n = prices.length;
        //dp[i][0]表示某一天不持股到该天为止的最大收益，dp[i][1]表示某天持股，到该天为止的最大收益
        int[][] dp = new int[n][2];
        //第一天不持股，总收益为0
        dp[0][0] = 0;
        //第一天持股，总收益为减去该天的股价
        dp[0][1] = -prices[0];
        //遍历后续每天，状态转移
        for(int i = 1; i < n; i++){
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        //最后一天不持股，到该天为止的最大收益
        return dp[n - 1][0];
    }

}
