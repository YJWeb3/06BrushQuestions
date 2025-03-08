package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d1_most_elements;

import java.util.Random;

/**
 * @program: StructAlgorithm
 * @ClassName RandomizationS17D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-39
 * @Version 1.0
 **/
public class RandomizationS17D1 {

    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        Random rand = new Random();

        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

}
