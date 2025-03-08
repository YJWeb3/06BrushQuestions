package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d11_exchange_chang_I;

/**
 * @program: StructAlgorithm
 * @ClassName SpatialMemoryRecursionS14D11
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-02
 * @Version 1.0
 **/
public class SpatialMemoryRecursionS14D11 {

    public int recursion(int[] arr, int aim, int[] dp){
        //组合超过了，返回-1
        if(aim < 0)
            return -1;
        //组合刚好等于需要的零钱
        if(aim == 0)
            return 0;
        //剩余零钱是否已经被运算过了
        if(dp[aim - 1] != 0)
            return dp[aim - 1];
        int Min = Integer.MAX_VALUE;
        //遍历所有面值
        for(int i = 0; i < arr.length; i++){
            //递归运算选择当前的面值
            int res = recursion(arr, aim - arr[i], dp);
            //获取最小值
            if(res >= 0 && res < Min)
                Min = res + 1;
        }
        //更新最小值
        dp[aim - 1] = Min == Integer.MAX_VALUE ? -1 : Min;
        return dp[aim - 1];
    }

    public int minMoney (int[] arr, int aim) {
        //小于1的都返回0
        if(aim < 1)
            return 0;
        //dp[i]表示凑齐i元最少需要多少货币数
        int[] dp = new int[aim + 1];
        return recursion(arr, aim, dp);
    }

}
