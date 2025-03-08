package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d25_jumping_game_II;

/**
 * @program: StructAlgorithm
 * @ClassName ForwardSearchMaxiReachablePositionS14D25
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-50
 * @Version 1.0
 **/
public class ForwardSearchMaxiReachablePositionS14D25 {

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

}
