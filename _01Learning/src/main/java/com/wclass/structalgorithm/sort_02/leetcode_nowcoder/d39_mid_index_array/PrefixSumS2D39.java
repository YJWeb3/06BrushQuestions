package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d39_mid_index_array;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName PrefixSumS2D39
 * @description:
 * @author: W哥
 * @create: 2024-09-17-20-22
 * @Version 1.0
 **/
public class PrefixSumS2D39 {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
