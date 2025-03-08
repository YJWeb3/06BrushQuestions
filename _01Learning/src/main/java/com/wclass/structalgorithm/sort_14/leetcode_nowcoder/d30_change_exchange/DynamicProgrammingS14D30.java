package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d30_change_exchange;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D30
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-59
 * @Version 1.0
 **/
public class DynamicProgrammingS14D30 {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

}
