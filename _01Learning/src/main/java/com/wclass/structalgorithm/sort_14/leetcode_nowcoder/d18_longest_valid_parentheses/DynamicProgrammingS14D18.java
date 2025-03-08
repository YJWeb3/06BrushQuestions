package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d18_longest_valid_parentheses;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D18
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-28
 * @Version 1.0
 **/
public class DynamicProgrammingS14D18 {

    public int longestValidParentheses (String s) {
        int res = 0;
        //长度为0的串或者空串，返回0
        if(s.length() == 0 || s == null)
            return res;
        //dp[i]表示以下标为i的字符为结束点的最长合法括号长度
        int[] dp = new int[s.length()];
        //第一位不管是左括号还是右括号都是0，因此不用管
        for(int i = 1; i < s.length(); i++){
            //取到左括号记为0，有右括号才合法
            if(s.charAt(i) == ')'){
                //如果该右括号前一位就是左括号
                if(s.charAt(i - 1) == '(')
                    //计数+
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                //找到这一段连续合法括号序列前第一个左括号做匹配
                else if(i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(')
                    dp[i] = (i - dp[i - 1] > 1 ? dp[i - dp[i - 1] - 2] : 0) + dp[i - 1] + 2;
            }
            //维护最大值
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
