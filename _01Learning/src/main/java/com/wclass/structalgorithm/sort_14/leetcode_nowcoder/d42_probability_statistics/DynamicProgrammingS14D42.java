package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d42_probability_statistics;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D42
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-10
 * @Version 1.0
 **/
public class DynamicProgrammingS14D42 {

    public double[] statisticsProbability(int num) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for (int i = 2; i <= num; i++) {
            double[] tmp = new double[5 * i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    tmp[j + k] += dp[j] / 6.0;
                }
            }
            dp = tmp;
        }
        return dp;
    }

}
