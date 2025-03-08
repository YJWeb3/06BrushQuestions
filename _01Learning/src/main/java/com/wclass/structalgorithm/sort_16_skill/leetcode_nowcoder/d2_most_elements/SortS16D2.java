package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d2_most_elements;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortS16D2
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-26
 * @Version 1.0
 **/
public class SortS16D2 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
