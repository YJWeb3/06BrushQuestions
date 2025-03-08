package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d3_integer_partition;

/**
 * @program: StructAlgorithm
 * @ClassName OptimizedDynamicProgrammingS17D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-42
 * @Version 1.0
 **/
public class OptimizedDynamicProgrammingS17D3 {

    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i - 2]), Math.max(3 * (i - 3), 3 * dp[i - 3]));
        }
        return dp[n];
    }

}
