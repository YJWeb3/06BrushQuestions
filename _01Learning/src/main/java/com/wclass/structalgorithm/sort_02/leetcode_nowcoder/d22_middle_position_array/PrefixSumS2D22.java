package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d22_middle_position_array;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName PrefixSumS1D22
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-04
 * @Version 1.0
 **/
public class PrefixSumS2D22 {

    public int findMiddleIndex(int[] nums) {
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
