package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d1_max_subarray;

/**
 * @program: StructAlgorithm
 * @ClassName ViolenceLawS2D1
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-52
 * @Version 1.0
 **/
public class ViolenceLawS2D1 {

    public int maxSubArray(int[] nums) {
        //max用于保存当前和的最大值
        int max = Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            int sum = 0;
            for (int j=i;j< nums.length;j++){
                sum += nums[j];
                max = sum > max ? sum:max;
            }
        }
        return max;
    }
}
