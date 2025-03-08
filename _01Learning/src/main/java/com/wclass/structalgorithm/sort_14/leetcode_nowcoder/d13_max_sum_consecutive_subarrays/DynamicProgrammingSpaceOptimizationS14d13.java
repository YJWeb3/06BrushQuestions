package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d13_max_sum_consecutive_subarrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingSpaceOptimizationS14d13
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-08
 * @Version 1.0
 **/
public class DynamicProgrammingSpaceOptimizationS14d13 {

    public int FindGreatestSumOfSubArray(int[] array) {
        int x = array[0];
        int y = 0;
        int maxsum = x;
        for(int i = 1; i < array.length; i++){
            //状态转移：连续子数组和最大值
            y = Math.max(x + array[i], array[i]);
            //维护最大值
            maxsum = Math.max(maxsum, y);
            //更新x的状态
            x = y;
        }
        return maxsum;
    }

}
