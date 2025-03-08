package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d11_number_operations_network_connected;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS7D11
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-47
 * @Version 1.0
 **/
public class DFSS7D11 {

    List<Integer>[] edges;
    boolean[] used;

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        edges = new List[n];
        for (int i = 0; i < n; ++i) {
            edges[i] = new ArrayList<Integer>();
        }
        for (int[] conn : connections) {
            edges[conn[0]].add(conn[1]);
            edges[conn[1]].add(conn[0]);
        }

        used = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (!used[i]) {
                dfs(i);
                ++ans;
            }
        }

        return ans - 1;
    }

    public void dfs(int u) {
        used[u] = true;
        for (int v : edges[u]) {
            if (!used[v]) {
                dfs(v);
            }
        }
    }

}
