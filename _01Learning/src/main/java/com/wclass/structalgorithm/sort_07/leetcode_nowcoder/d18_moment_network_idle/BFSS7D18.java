package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d18_moment_network_idle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS7D18
 * @description:
 * @author: W哥
 * @create: 2024-10-01-21-00
 * @Version 1.0
 **/
public class BFSS7D18 {

    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int n = patience.length;
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; ++i) {
            adj[i] = new ArrayList<Integer>();
        }
        boolean[] visit = new boolean[n];
        for (int[] v : edges) {
            adj[v[0]].add(v[1]);
            adj[v[1]].add(v[0]);
        }

        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(0);
        visit[0] = true;
        int dist = 1;
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                for (int v : adj[curr]) {
                    if (visit[v]) {
                        continue;
                    }
                    queue.offer(v);
                    int time = patience[v] * ((2 * dist - 1) / patience[v]) + 2 * dist + 1;
                    ans = Math.max(ans, time);
                    visit[v] = true;
                }
            }
            dist++;
        }
        return ans;
    }

}
