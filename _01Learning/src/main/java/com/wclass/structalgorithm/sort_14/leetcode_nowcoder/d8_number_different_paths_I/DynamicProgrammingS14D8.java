package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d8_number_different_paths_I;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D8
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-52
 * @Version 1.0
 **/
public class DynamicProgrammingS14D8 {

    public int uniquePaths (int m, int n) {
        //dp[i][j]表示大小为i*j的矩阵的路径数量
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                //只有1行的时候，只有一种路径
                if(i == 1){
                    dp[i][j] = 1;
                    continue;
                }
                //只有1列的时候，只有一种路径
                if(j == 1){
                    dp[i][j] = 1;
                    continue;
                }
                //路径数等于左方格子的路径数加上上方格子的路径数
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }

}
