package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d20_house_robbery_II;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D20
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-30
 * @Version 1.0
 **/
public class DynamicProgrammingS14D20 {

    public int rob (int[] nums) {
        //dp[i]表示长度为i的数组，最多能偷取多少钱
        int[] dp = new int[nums.length + 1];
        //选择偷了第一家
        dp[1] = nums[0];
        //最后一家不能偷
        for(int i = 2; i < nums.length; i++)
            //对于每家可以选择偷或者不偷
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
        int res = dp[nums.length - 1];
        //清除dp数组，第二次循环
        Arrays.fill(dp, 0);
        //不偷第一家
        dp[1] = 0;
        //可以偷最后一家
        for(int i = 2; i <= nums.length; i++)
            //对于每家可以选择偷或者不偷
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
        //选择最大值
        return Math.max(res, dp[nums.length]);
    }

}
