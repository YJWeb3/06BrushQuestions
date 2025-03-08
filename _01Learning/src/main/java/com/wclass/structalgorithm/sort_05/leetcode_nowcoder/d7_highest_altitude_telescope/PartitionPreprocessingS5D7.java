package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d7_highest_altitude_telescope;

/**
 * @program: StructAlgorithm
 * @ClassName PartitionPreprocessingS5D7
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-52
 * @Version 1.0
 **/
public class PartitionPreprocessingS5D7 {

    public int[] maxAltitude(int[] heights, int limit) {
        int n = heights.length;
        if(n==0){
            return new int[0];
        }
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        for (int i = 0; i < n; ++i) {
            if (i % limit == 0) {
                prefixMax[i] = heights[i];
            }
            else {
                prefixMax[i] = Math.max(prefixMax[i - 1], heights[i]);
            }
        }
        for (int i = n - 1; i >= 0; --i) {
            if (i == n - 1 || (i + 1) % limit == 0) {
                suffixMax[i] = heights[i];
            } else {
                suffixMax[i] = Math.max(suffixMax[i + 1], heights[i]);
            }
        }

        int[] ans = new int[n - limit + 1];
        for (int i = 0; i <= n - limit; ++i) {
            ans[i] = Math.max(suffixMax[i], prefixMax[i + limit - 1]);
        }
        return ans;
    }

}
