package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d2_most_elements;

/**
 * @program: StructAlgorithm
 * @ClassName BoyerMooreS16D2
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-28
 * @Version 1.0
 **/
public class BoyerMooreS16D2 {

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
