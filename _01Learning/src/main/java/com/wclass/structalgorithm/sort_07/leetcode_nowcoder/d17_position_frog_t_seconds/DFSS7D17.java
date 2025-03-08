package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d17_position_frog_t_seconds;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS7D17
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-59
 * @Version 1.0
 **/
public class DFSS7D17 {

    public double frogPosition(int n, int[][] edges, int t, int target) {
        List<Integer>[] G = new ArrayList[n + 1];
        for (int i = 1; i <= n; ++i)
            G[i] = new ArrayList<>();
        for (int[] e : edges) {
            G[e[0]].add(e[1]);
            G[e[1]].add(e[0]);
        }
        boolean[] seen = new boolean[n + 1];
        return dfs(G, seen, 1, t, target);
    }

    private double dfs(List<Integer>[] G, boolean[] seen, int i, int t, int target) {
        int nxt = i == 1 ? G[i].size() : G[i].size() - 1;
        if (t == 0 || nxt == 0) {
            return i == target ? 1.0 : 0.0;
        }
        seen[i] = true;
        double ans = 0.0;
        for (int j : G[i]) {
            if (!seen[j]) {
                ans += dfs(G, seen, j, t - 1, target);
            }
        }
        return ans / nxt;
    }

}
