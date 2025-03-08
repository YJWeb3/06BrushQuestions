package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d1_most_elements;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortS17D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-38
 * @Version 1.0
 **/
public class SortS17D1 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
