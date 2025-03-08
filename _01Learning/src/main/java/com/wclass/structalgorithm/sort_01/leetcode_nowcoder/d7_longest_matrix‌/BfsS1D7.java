package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d7_longest_matrix‌;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BfsS1D7
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-50
 * @Version 1.0
 **/
public class BfsS1D7 {

    //记录四个方向
    private int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int n, m;
    public int solve (int[][] matrix) {
        //矩阵不为空
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int res = 0;
        n = matrix.length;
        m = matrix[0].length;
        //i，j处的单元格拥有的最长递增路径
        int[][] outdegrees = new int[m + 1][n + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < 4; k++){
                    int nexti = i + dirs[k][0];
                    int nextj = j + dirs[k][1];
                    if(nexti >= 0 && nexti < n && nextj >= 0 && nextj < m && matrix[nexti][nextj] > matrix[i][j]){
                        //符合条件，记录出度
                        outdegrees[i][j]++;
                    }
                }
            }
        }
        //辅助队列
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(outdegrees[i][j] == 0){
                    //找到出度为0的入队列
                    q1.offer(i);
                    q2.offer(j);
                }
            }
        }
        while(!q1.isEmpty()){
            res++;
            int size = q1.size();
            for(int x = 0; x < size; x++){
                int i = q1.poll();
                int j = q2.poll();
                //四个方向
                for(int k = 0; k < 4; k++){
                    int nexti = i + dirs[k][0];
                    int nextj = j + dirs[k][1];
                    //逆向搜索，所以下一步是小于
                    if (nexti >= 0 && nexti < n && nextj >= 0 && nextj < m && matrix[nexti][nextj] < matrix[i][j]) {
                        //符合条件，出度递减
                        outdegrees[nexti][nextj]--;
                        if (outdegrees[nexti][nextj] == 0) {
                            q1.offer(nexti);
                            q2.offer(nextj);
                        }
                    }
                }
            }
        }
        return res;
    }

}
