package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d105_NumberOfIsLandIII
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/22 15:16
 * @Author:NieZheng
 * @Version:1.0
 */
public class d105_NumberOfIsLandIII {

    int INF = 1000,load_count = 0;
    int[] x_dir = {1,-1,0,0};
    int[] y_dir = {0,0,1,-1};
    int[] board = {INF,-1,INF,-1};
    int[][] vis;

    int calculate_area(){
        return (board[1] - board[0] + 1) * (board[3] - board[2] + 1);
    }

    void update_board(int x_temp,int y_temp){
        board[0] = Math.min(board[0],y_temp);
        board[1] = Math.max(board[1],y_temp);
        board[2] = Math.min(board[2],x_temp);
        board[3] = Math.max(board[3],x_temp);
    }

    void DFS(int[][] isLand,int x,int y){
        int n = isLand.length,m = isLand[0].length;

        for (int i = 0; i < 4; i++) {
            int x_temp = x + x_dir[i];
            int y_temp = y + y_dir[i];

            if (x_temp >= 0 && x_temp < n && y_temp >= 0 && y_temp < m && isLand[x_temp][y_temp] == 1
            && vis[x_temp][y_temp] == 0){
                vis[x_temp][y_temp] = 1;
                update_board(x_temp,y_temp);
                load_count++;
                DFS(isLand,x_temp,y_temp);
            }
        }
    }
    public int NumberOfIsLandIII(int[][] isLand){
        int res = 0;
        if (isLand.length == 0)
            return 0;
        int n = isLand.length,m = isLand[0].length;
        vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && isLand[i][j] == 1){
                    load_count = 1;
                    vis[i][j] = INF;
                    board[1] = -1;
                    board[3] = -1;

                    update_board(i,j);
                    DFS(isLand,i,j);
                    if (calculate_area() == load_count)
                        res +=1;
                }
            }
        }
        return res;
    }
}
