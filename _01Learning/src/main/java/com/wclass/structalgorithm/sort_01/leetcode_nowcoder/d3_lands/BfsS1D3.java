package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d3_lands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName Bfs
 * @description:
 * @author: W哥
 * @create: 2024-09-07-00-15
 * @Version 1.0
 **/
public class BfsS1D3 {
    public int solve (char[][] grid) {
        int n = grid.length;
        //空矩阵的情况
        if (n == 0)
            return 0;
        int m = grid[0].length;
        //记录岛屿数
        int count = 0;
        //遍历矩阵
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                //遇到1要将这个1及与其相邻的1都置为0
                if(grid[i][j] == '1'){
                    //岛屿数增加
                    count++;
                    grid[i][j] = '0';
                    //记录后续bfs的坐标
                    Queue<Integer> q1 = new LinkedList<Integer>();
                    Queue<Integer> q2 = new LinkedList<Integer>();
                    q1.offer(i);
                    q2.offer(j);
                    //bfs
                    while(!q1.isEmpty()){
                        int row = q1.poll();
                        int col = q2.poll();
                        //四个方向依次检查：不越界且为1
                        if(row - 1 >= 0 && grid[row - 1][col] == '1'){
                            q1.offer(row - 1);
                            q2.offer(col);
                            grid[row - 1][col] = '0';
                        }
                        if(row + 1 < n && grid[row + 1][col] == '1'){
                            q1.offer(row + 1);
                            q2.offer(col);
                            grid[row + 1][col] = '0';
                        }
                        if(col - 1 >= 0 && grid[row][col - 1] == '1'){
                            q1.offer(row);
                            q2.offer(col - 1);
                            grid[row][col - 1] = '0';
                        }
                        if(col + 1 < m && grid[row][col + 1] == '1'){
                            q1.offer(row);
                            q2.offer(col + 1);
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }
        return count;
    }
}
