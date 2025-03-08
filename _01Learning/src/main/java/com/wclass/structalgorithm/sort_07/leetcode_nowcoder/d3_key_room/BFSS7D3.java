package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d3_key_room;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS7D3
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-24
 * @Version 1.0
 **/
public class BFSS7D3 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size(), num = 0;
        boolean[] vis = new boolean[n];
        Queue<Integer> que = new LinkedList<Integer>();
        vis[0] = true;
        que.offer(0);
        while (!que.isEmpty()) {
            int x = que.poll();
            num++;
            for (int it : rooms.get(x)) {
                if (!vis[it]) {
                    vis[it] = true;
                    que.offer(it);
                }
            }
        }
        return num == n;
    }

}
