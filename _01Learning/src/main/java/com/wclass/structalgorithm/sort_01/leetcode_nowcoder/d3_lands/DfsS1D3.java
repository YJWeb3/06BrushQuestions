package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d3_lands;

/**
 * @program: StructAlgorithm
 * @ClassName Dfs
 * @description:
 * @author: W哥
 * @create: 2024-09-07-00-14
 * @Version 1.0
 **/
public class DfsS1D3 {
    //深度优先遍历与i，j相邻的所有1
    public void dfs(char[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        // 置为0
        grid[i][j] = '0';
        //后续四个方向遍历
        if(i - 1 >= 0 && grid[i - 1][j] == '1')
            dfs(grid, i - 1, j);
        if(i + 1 < n && grid[i + 1][j] == '1')
            dfs(grid, i + 1,j);
        if(j - 1 >= 0 && grid[i][j - 1] == '1')
            dfs(grid, i, j - 1);
        if(j + 1 < m && grid[i][j + 1] == '1')
            dfs(grid, i, j + 1);
    }

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
                //遍历到1的情况
                if(grid[i][j] == '1'){
                    //计数
                    count++;
                    //将与这个1相邻的所有1置为0
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}
