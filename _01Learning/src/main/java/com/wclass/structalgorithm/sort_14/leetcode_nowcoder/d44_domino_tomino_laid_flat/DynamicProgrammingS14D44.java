package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d44_domino_tomino_laid_flat;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D44
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-15
 * @Version 1.0
 **/
public class DynamicProgrammingS14D44 {

    static final int MOD = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n + 1][4];
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][3];
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD + dp[i - 1][3]) % MOD;
        }
        return dp[n][3];
    }

}
