package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d1_max_subarray;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS2D1
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-54
 * @Version 1.0
 **/
public class DynamicProgrammingS2D1 {

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

}
