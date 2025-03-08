package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d1_most_elements;

/**
 * @program: StructAlgorithm
 * @ClassName BoyerMooreS17D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-39
 * @Version 1.0
 **/
public class BoyerMooreS17D1 {

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

}
