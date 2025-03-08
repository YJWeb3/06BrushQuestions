package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d3_key_room;

import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS7D3
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-24
 * @Version 1.0
 **/
public class DFSS7D3 {

    boolean[] vis;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }

}
