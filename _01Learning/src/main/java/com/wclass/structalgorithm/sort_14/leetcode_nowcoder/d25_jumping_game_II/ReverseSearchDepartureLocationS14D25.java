package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d25_jumping_game_II;

/**
 * @program: StructAlgorithm
 * @ClassName d26_reverse_search_departure_location
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-49
 * @Version 1.0
 **/
public class ReverseSearchDepartureLocationS14D25 {

    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

}
