package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d1_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTabelS8D1
 * @description:
 * @author: W哥
 * @create: 2024-10-02-15-58
 * @Version 1.0
 **/
public class HashTabelS8D1 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
