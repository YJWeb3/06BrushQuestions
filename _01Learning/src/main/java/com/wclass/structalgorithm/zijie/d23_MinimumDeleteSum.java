package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d23_MinimumDeleteSum
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 15:06
 * @Author:NieZheng
 * @Version:1.0
 */
public class d23_MinimumDeleteSum {

    public int MinimunmDeleteSum(String s1,String s2){
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int sum = 0;
        for (int i = 0; i < s1.length(); i++)
            sum += (int)s1.charAt(i);
        for (int i = 0; i < s1.length(); i++)
            sum += (int)s2.charAt(i);
        for (int i = 1; i < s1.length(); i++) {
            for (int j = 1; j < s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = Math.max((int)s1.charAt(i-1) + dp[i-1][j-1],Math.max(dp[i-1][j],dp[i][j-1]));
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return sum - 2 * dp[s1.length()][s2.length()];
    }
}
