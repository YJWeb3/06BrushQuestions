package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d3_number_provinces.DFSS8D3;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS8D3
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-01
 * @Version 1.0
 **/
public class DFSS8D3 {

    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        int provinces = 0;
        for (int i = 0; i < cities; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, cities, i);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int cities, int i) {
        for (int j = 0; j < cities; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, cities, j);
            }
        }
    }

}
