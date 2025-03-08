package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d4_max_area_island;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS8D4
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-05
 * @Version 1.0
 **/
public class BFSS8D4 {

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i != grid.length; ++i) {
            for (int j = 0; j != grid[0].length; ++j) {
                int cur = 0;
                Queue<Integer> queuei = new LinkedList<Integer>();
                Queue<Integer> queuej = new LinkedList<Integer>();
                queuei.offer(i);
                queuej.offer(j);
                while (!queuei.isEmpty()) {
                    int cur_i = queuei.poll(), cur_j = queuej.poll();
                    if (cur_i < 0 || cur_j < 0 || cur_i == grid.length || cur_j == grid[0].length || grid[cur_i][cur_j] != 1) {
                        continue;
                    }
                    ++cur;
                    grid[cur_i][cur_j] = 0;
                    int[] di = {0, 0, 1, -1};
                    int[] dj = {1, -1, 0, 0};
                    for (int index = 0; index != 4; ++index) {
                        int next_i = cur_i + di[index], next_j = cur_j + dj[index];
                        queuei.offer(next_i);
                        queuej.offer(next_j);
                    }
                }
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }

}
