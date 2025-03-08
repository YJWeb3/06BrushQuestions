package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d31_deleting_an_element;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveOptimizationS2D31
 * @description:
 * @author: W哥
 * @create: 2024-09-17-19-33
 * @Version 1.0
 **/
public class RecursiveOptimizationS2D31 {

    public int longestSubarray(int[] nums) {
        int ans = 0;
        int p0 = 0, p1 = 0;
        for (int num : nums) {
            if (num == 0) {
                p1 = p0;
                p0 = 0;
            } else {
                ++p0;
                ++p1;
            }
            ans = Math.max(ans, p1);
        }
        if (ans == nums.length) {
            --ans;
        }
        return ans;
    }

}
