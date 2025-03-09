package com.wclass.brush.d2_dynamic.d2_improve.d2_two_dimension;

/**
 * @program: 06BrushQuestions
 * @ClassName TwoDimDP
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-17-54
 * @Version 1.0
 **/
public class TwoDimDP {
    public static int countSubsequences(String s) {
        int n = s.length();
        // 创建一个二维数组dp，其中dp[i][j]表示s的前i个字符中，以第i个字符结尾，并且以第j个字符结束的子序列的数量
        int[][] dp = new int[n + 1][26]; // 26是因为英文字母有26个

        // 初始化dp数组，每个字符自身可以作为一个子序列
        for (int i = 0; i < n; i++) {
            dp[i + 1][s.charAt(i) - 'a'] = 1; // 注意：字符减去'a'得到它在字母表中的位置
        }

        // 填充dp数组
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 26; j++) {
                // 对于每个字符，它要么出现在上一个字符的子序列中，要么不出现
                // 如果当前字符与上一个字符相同，则有两种情况：要么包含当前字符，要么不包含当前字符
                // 如果不同，则可以包含当前字符，也可以不包含当前字符
                dp[i][j] = dp[i - 1][j] + (s.charAt(i - 1) - 'a' == j ? 1 : 0);
            }
        }

        // 计算所有子序列的总数，即所有dp[n][j]的和
        int totalCount = 0;
        for (int j = 0; j < 26; j++) {
            totalCount += dp[n][j];
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Total number of distinct subsequences: " + countSubsequences(s));
    }

}
