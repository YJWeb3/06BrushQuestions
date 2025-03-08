package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d2_nearest_exit_entrance_maze;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName Solution01
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-20
 * @Version 1.0
 **/
public class Solution01 {

    public int nearestExit(char[][] maze, int[] entrance) {

        int m = maze.length;
        int n = maze[0].length;
        // 变向数组
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        // 初始化迷宫入口坐标和距离 并入队
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {entrance[0], entrance[1], 0});
        // 遍历到的坐标变为墙 防止重复遍历
        maze[entrance[0]][entrance[1]] = '+';
        while(!queue.isEmpty()){
            int[] curLocal = queue.poll(); // 坐标出队
            int row = curLocal[0]; //坐标行
            int col = curLocal[1]; //坐标列
            for(int i = 0; i < 4; i++){
                int x = row + dx[i];
                int y = col + dy[i];
                // 新坐标合法 且 不为墙
                if(x >= 0 && x <= m - 1 && y >= 0 && y <= n - 1 && maze[x][y] == '.'){
                    // 新坐标为出口
                    if(x == 0 || x == m - 1 || y == 0 || y == n - 1){
                        return curLocal[2] + 1; // 多迈一步才能走出迷宫
                    }
                    queue.offer(new int[] {x, y, curLocal[2] + 1});
                    maze[x][y] = '+';
                }
            }
        }
        return -1;
    }

}
