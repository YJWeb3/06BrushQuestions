package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d24_k_subarray;

/**
 * @program: StructAlgorithm
 * @ClassName EnumerationS2D24
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-13
 * @Version 1.0
 **/
public class EnumerationS2D24 {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

}
