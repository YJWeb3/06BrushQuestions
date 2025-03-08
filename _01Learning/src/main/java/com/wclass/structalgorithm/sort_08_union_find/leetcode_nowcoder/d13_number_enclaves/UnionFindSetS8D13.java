package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d13_number_enclaves;

/**
 * @program: StructAlgorithm
 * @ClassName UnionFindSetS8D13
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-20
 * @Version 1.0
 **/
public class UnionFindSetS8D13 {
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        UnionFind uf = new UnionFind(grid);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int index = i * n + j;
                    if (j + 1 < n && grid[i][j + 1] == 1) {
                        uf.union(index, index + 1);
                    }
                    if (i + 1 < m && grid[i + 1][j] == 1) {
                        uf.union(index, index + n);
                    }
                }
            }
        }
        int enclaves = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 1 && !uf.isOnEdge(i * n + j)) {
                    enclaves++;
                }
            }
        }
        return enclaves;
    }
}

class UnionFind {
    private int[] parent;
    private boolean[] onEdge;
    private int[] rank;

    public UnionFind(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        parent = new int[m * n];
        onEdge = new boolean[m * n];
        rank = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int index = i * n + j;
                    parent[index] = index;
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        onEdge[index] = true;
                    }
                }
            }
        }
    }

    public int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void union(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        if (rootx != rooty) {
            if (rank[rootx] > rank[rooty]) {
                parent[rooty] = rootx;
                onEdge[rootx] |= onEdge[rooty];
            } else if (rank[rootx] < rank[rooty]) {
                parent[rootx] = rooty;
                onEdge[rooty] |= onEdge[rootx];
            } else {
                parent[rooty] = rootx;
                onEdge[rootx] |= onEdge[rooty];
                rank[rootx]++;
            }
        }
    }

    public boolean isOnEdge(int i) {
        return onEdge[find(i)];
    }
}