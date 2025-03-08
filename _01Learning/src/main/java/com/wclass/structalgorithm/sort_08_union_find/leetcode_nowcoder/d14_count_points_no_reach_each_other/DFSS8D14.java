package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d14_count_points_no_reach_each_other;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS8D14
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-23
 * @Version 1.0
 **/
public class DFSS8D14 {

    public long countPairs(int n, int[][] edges) {
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        long res = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long count = dfs(i, graph, visited);
                res += count * (n - count);
            }
        }
        return res / 2;
    }

    public int dfs(int x, List<Integer>[] graph, boolean[] visited) {
        visited[x] = true;
        int count = 1;
        for (int y : graph[x]) {
            if (!visited[y]) {
                count += dfs(y, graph, visited);
            }
        }
        return count;
    }

}
