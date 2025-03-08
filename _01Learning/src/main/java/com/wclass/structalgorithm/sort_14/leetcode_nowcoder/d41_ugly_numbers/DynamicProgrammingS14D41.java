package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d41_ugly_numbers;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D41
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-07
 * @Version 1.0
 **/
public class DynamicProgrammingS14D41 {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

}
