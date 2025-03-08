package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d35_longest_valid_parentheses‌;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D35
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-17
 * @Version 1.0
 **/
public class DynamicProgrammingS14D35 {

    public int longestValidParentheses(String s) {
        int maxans = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

}
