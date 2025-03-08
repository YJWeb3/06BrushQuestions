package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d3_number_provinces.DFSS8D3;

/**
 * @program: StructAlgorithm
 * @ClassName UnionFindSetS8D3
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-02
 * @Version 1.0
 **/
public class UnionFindSetS8D3 {

    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        int[] parent = new int[cities];
        for (int i = 0; i < cities; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < cities; i++) {
            for (int j = i + 1; j < cities; j++) {
                if (isConnected[i][j] == 1) {
                    union(parent, i, j);
                }
            }
        }
        int provinces = 0;
        for (int i = 0; i < cities; i++) {
            if (parent[i] == i) {
                provinces++;
            }
        }
        return provinces;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }

}
