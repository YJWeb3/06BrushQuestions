package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d15_increasing_triplet_subsequence;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS2D15
 * @description:
 * @author: W哥
 * @create: 2024-09-15-22-39
 * @Version 1.0
 **/
public class GreedyS2D15 {

    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        int first = nums[0], second = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            if (num > second) {
                return true;
            } else if (num > first) {
                second = num;
            } else {
                first = num;
            }
        }
        return false;
    }

}
