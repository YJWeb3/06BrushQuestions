package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d3_integer_partition;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS17D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-42
 * @Version 1.0
 **/
public class DynamicProgrammingS17D3 {

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }

}
