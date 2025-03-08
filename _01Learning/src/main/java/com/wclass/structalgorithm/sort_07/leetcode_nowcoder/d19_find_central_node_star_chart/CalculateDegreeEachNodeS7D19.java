package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d19_find_central_node_star_chart;

/**
 * @program: StructAlgorithm
 * @ClassName CalculateDegreeEachNodeS7D19
 * @description:
 * @author: W哥
 * @create: 2024-10-01-21-01
 * @Version 1.0
 **/
public class CalculateDegreeEachNodeS7D19 {

    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] degrees = new int[n + 1];
        for (int[] edge : edges) {
            degrees[edge[0]]++;
            degrees[edge[1]]++;
        }
        for (int i = 1; ; i++) {
            if (degrees[i] == n - 1) {
                return i;
            }
        }
    }

}
