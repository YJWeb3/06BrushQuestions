package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d11_exchange_chang_I;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D11
 * @description:
 * @author: W哥
 * @create: 2024-09-21-20-59
 * @Version 1.0
 **/
public class DynamicProgrammingS14D11 {

    public int minMoney (int[] arr, int aim) {
        //小于1的都返回0
        if(aim < 1)
            return 0;
        int[] dp = new int[aim + 1];
        //dp[i]表示凑齐i元最少需要多少货币数
        Arrays.fill(dp, aim + 1);
        dp[0] = 0;
        //遍历1-aim元
        for(int i = 1; i <= aim; i++){
            //每种面值的货币都要枚举
            for(int j = 0; j < arr.length; j++){
                //如果面值不超过要凑的钱才能用
                if(arr[j] <= i)
                    //维护最小值
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
            }
        }
        //如果最终答案大于aim代表无解
        return dp[aim] > aim ? -1 : dp[aim];
    }

}
