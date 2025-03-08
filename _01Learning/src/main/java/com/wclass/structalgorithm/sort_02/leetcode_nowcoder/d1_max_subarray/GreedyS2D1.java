package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d1_max_subarray;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS2D2
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-54
 * @Version 1.0
 **/
public class GreedyS2D1 {

    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < length; ++i){
            sum += nums[i];
            res = Math.max(sum, res);
            if(sum < 0){
                sum = 0;
            }
        }
        return res;
    }

}
