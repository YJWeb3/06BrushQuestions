package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d3_number_provinces.DFSS8D3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS8D3
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-02
 * @Version 1.0
 **/
public class BFSS8D3 {

    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        int provinces = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < cities; i++) {
            if (!visited[i]) {
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int j = queue.poll();
                    visited[j] = true;
                    for (int k = 0; k < cities; k++) {
                        if (isConnected[j][k] == 1 && !visited[k]) {
                            queue.offer(k);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }

}
