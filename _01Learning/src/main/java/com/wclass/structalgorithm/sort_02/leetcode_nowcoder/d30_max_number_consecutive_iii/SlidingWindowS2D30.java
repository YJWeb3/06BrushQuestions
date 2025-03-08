package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d30_max_number_consecutive_iii;

/**
 * @program: StructAlgorithm
 * @ClassName SlidingWindowS2D30
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-30
 * @Version 1.0
 **/
public class SlidingWindowS2D30 {

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, lsum = 0, rsum = 0;
        int ans = 0;
        for (int right = 0; right < n; ++right) {
            rsum += 1 - nums[right];
            while (lsum < rsum - k) {
                lsum += 1 - nums[left];
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

}
