package com.wclass.structalgorithm.sort_08_union_find.leetcode_nowcoder.d4_max_area_island;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName DFSStackS8D4
 * @description:
 * @author: W哥
 * @create: 2024-10-02-16-04
 * @Version 1.0
 **/
public class DFSStackS8D4 {

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i != grid.length; ++i) {
            for (int j = 0; j != grid[0].length; ++j) {
                int cur = 0;
                Deque<Integer> stacki = new LinkedList<Integer>();
                Deque<Integer> stackj = new LinkedList<Integer>();
                stacki.push(i);
                stackj.push(j);
                while (!stacki.isEmpty()) {
                    int cur_i = stacki.pop(), cur_j = stackj.pop();
                    if (cur_i < 0 || cur_j < 0 || cur_i == grid.length || cur_j == grid[0].length || grid[cur_i][cur_j] != 1) {
                        continue;
                    }
                    ++cur;
                    grid[cur_i][cur_j] = 0;
                    int[] di = {0, 0, 1, -1};
                    int[] dj = {1, -1, 0, 0};
                    for (int index = 0; index != 4; ++index) {
                        int next_i = cur_i + di[index], next_j = cur_j + dj[index];
                        stacki.push(next_i);
                        stackj.push(next_j);
                    }
                }
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }

}
