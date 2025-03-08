package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d12_longest_increasing_subsequence_I;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D12
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-06
 * @Version 1.0
 **/
public class DynamicProgrammingS14D12 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 给定数组的最长严格上升子序列的长度。
     * @param arr int整型一维数组 给定的数组
     * @return int整型
     */
    public int LIS (int[] arr) {
        int n=arr.length;
        //特殊请款判断
        if(n==0) return 0;
        //dp[i]表示以下标i结尾的最长上升子序列长度
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            //初始化为1
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    //只要前面某个数小于当前数，则要么长度在之前基础上加1，要么保持不变，取较大者
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        //返回所有可能中的最大值
        return Arrays.stream(dp).max().getAsInt();
    }

}
