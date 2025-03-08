package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d6_find_judge_town;

/**
 * @program: StructAlgorithm
 * @ClassName CalculateInOutDegreeEachNodeS7D6
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-31
 * @Version 1.0
 **/
public class CalculateInOutDegreeEachNodeS7D6 {

    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust) {
            int x = edge[0], y = edge[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
