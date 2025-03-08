package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d4_daily_temperature;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName ViolenceS5D4
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-26
 * @Version 1.0
 **/
public class ViolenceS5D4 {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int t = temperatures[i] + 1; t <= 100; ++t) {
                if (next[t] < warmerIndex) {
                    warmerIndex = next[t];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                ans[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }
        return ans;
    }

}
