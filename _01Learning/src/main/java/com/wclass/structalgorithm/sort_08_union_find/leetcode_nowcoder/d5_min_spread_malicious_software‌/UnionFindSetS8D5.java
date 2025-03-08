package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d5_min_spread_malicious_software‌;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName UnionFindSetS8D5
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-06
 * @Version 1.0
 **/
public class UnionFindSetS8D5 {

    public int minMalwareSpread(int[][] graph, int[] initial) {
        int N = graph.length;
        DSU dsu = new DSU(N);
        for (int i = 0; i < N; ++i)
            for (int j = i+1; j < N; ++j)
                if (graph[i][j] == 1)
                    dsu.union(i, j);

        int[] count = new int[N];
        for (int node: initial)
            count[dsu.find(node)]++;

        int ans = -1, ansSize = -1;
        for (int node: initial) {
            int root = dsu.find(node);
            if (count[root] == 1) {  // unique color
                int rootSize = dsu.size(root);
                if (rootSize > ansSize) {
                    ansSize = rootSize;
                    ans = node;
                } else if (rootSize == ansSize && node < ans) {
                    ansSize = rootSize;
                    ans = node;
                }
            }
        }

        if (ans == -1) {
            ans = Integer.MAX_VALUE;
            for (int node: initial)
                ans = Math.min(ans, node);
        }
        return ans;
    }
}


class DSU {
    int[] p, sz;

    DSU(int N) {
        p = new int[N];
        for (int x = 0; x < N; ++x)
            p[x] = x;

        sz = new int[N];
        Arrays.fill(sz, 1);
    }

    public int find(int x) {
        if (p[x] != x)
            p[x] = find(p[x]);
        return p[x];
    }

    public void union(int x, int y) {
        int xr = find(x);
        int yr = find(y);
        p[xr] = yr;
        sz[yr] += sz[xr];
    }

    public int size(int x) {
        return sz[find(x)];
    }
}
