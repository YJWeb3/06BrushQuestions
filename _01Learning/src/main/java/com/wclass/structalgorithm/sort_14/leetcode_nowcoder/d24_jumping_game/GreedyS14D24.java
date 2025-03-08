package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d24_jumping_game;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS14D25
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-37
 * @Version 1.0
 **/
public class GreedyS14D24 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
