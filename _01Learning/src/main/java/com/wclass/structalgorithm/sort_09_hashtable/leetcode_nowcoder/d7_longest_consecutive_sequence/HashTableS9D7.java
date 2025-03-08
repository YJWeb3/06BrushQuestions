package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d7_longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D7
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-13
 * @Version 1.0
 **/
public class HashTableS9D7 {

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
