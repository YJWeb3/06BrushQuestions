package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d4_jumping_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveImprovementS14D4
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-44
 * @Version 1.0
 **/
public class RecursiveImprovementS14D4 {

    //设置全局变量，因为实际问题中没有0，则可用0作初始标识值
    private int[] dp = new int[50];
    public int F(int n){
        if(n <= 1)
            return 1;
        //若是dp中有值则不需要重新递归加一次
        if(dp[n] != 0)
            return dp[n];
        //若是dp中没有值则需要重新递归加一次
        return dp[n] = F(n - 1) + F(n - 2);
    }
    public int jumpFloor(int target) {
        return F(target);
    }

}
