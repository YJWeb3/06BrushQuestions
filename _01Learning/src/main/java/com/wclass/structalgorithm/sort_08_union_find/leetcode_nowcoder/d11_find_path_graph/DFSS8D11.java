package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d11_find_path_graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS8D11
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-17
 * @Version 1.0
 **/
public class DFSS8D11 {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }

    public boolean dfs(int source, int destination, List<Integer>[] adj, boolean[] visited) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        for (int next : adj[source]) {
            if (!visited[next] && dfs(next, destination, adj, visited)) {
                return true;
            }
        }
        return false;
    }

}
