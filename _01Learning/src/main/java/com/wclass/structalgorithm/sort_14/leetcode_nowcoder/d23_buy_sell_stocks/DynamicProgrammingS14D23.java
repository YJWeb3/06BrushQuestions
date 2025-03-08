package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d23_buy_sell_stocks;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D23
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-33
 * @Version 1.0
 **/
public class DynamicProgrammingS14D23 {

    public int maxProfit (int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][5];
        //初始化dp为最小
        Arrays.fill(dp[0], -10000);
        //第0天不持有状态
        dp[0][0] = 0;
        //第0天持有股票
        dp[0][1] = -prices[0];
        //状态转移
        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        //选取最大值，可以只操作一次
        return Math.max(dp[n - 1][2],Math.max(0, dp[n - 1][4]));
    }

}
