package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d2_nearest_exit_entrance_maze;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName Solution02
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-21
 * @Version 1.0
 **/
public class Solution02 {

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int step = 0; // 相当于树的层数
        boolean[][] visited = new boolean[m][n]; // 记录是否遍历过

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // 初始化迷宫入口坐标
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {entrance[0], entrance[1]});
        visited[entrance[0]][entrance[1]] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int k = 0; k < size; k++){
                int[] curLocal = queue.poll(); // 坐标出队
                int row = curLocal[0];
                int col = curLocal[1];
                for(int i = 0; i < 4; i++){
                    int x = row + dx[i];
                    int y = col + dy[i];
                    // 坐标非法 或 坐标是墙 或 坐标已经被遍历过
                    if(x < 0 || x >= m || y < 0 || y >= n || maze[x][y] == '+' || visited[x][y]){
                        continue;
                    }
                    // 找到出口
                    if(x == 0 || x == m - 1 || y == 0 || y == n - 1){
                        return step + 1;
                    }
                    // 节点入队 并置true
                    queue.offer(new int[] {x, y});
                    visited[x][y] = true;
                }
            }
            step++;
        }
        return -1;
    }

}
