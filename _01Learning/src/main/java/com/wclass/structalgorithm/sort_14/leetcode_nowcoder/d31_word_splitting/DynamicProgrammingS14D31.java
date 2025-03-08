package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d31_word_splitting;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D31
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-11
 * @Version 1.0
 **/
public class DynamicProgrammingS14D31 {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
