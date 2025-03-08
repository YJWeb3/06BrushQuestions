package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d11_find_path_graph;

/**
 * @program: StructAlgorithm
 * @ClassName UnionFindSetS8D11
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-18
 * @Version 1.0
 **/
public class UnionFindSetS8D11 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        UnionFind uf = new UnionFind(n);
        for (int[] edge : edges) {
            uf.uni(edge[0], edge[1]);
        }
        return uf.connect(source, destination);
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void uni(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        if (rootx != rooty) {
            if (rank[rootx] > rank[rooty]) {
                parent[rooty] = rootx;
            } else if (rank[rootx] < rank[rooty]) {
                parent[rootx] = rooty;
            } else {
                parent[rooty] = rootx;
                rank[rootx]++;
            }
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean connect(int x, int y) {
        return find(x) == find(y);
    }
}