package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d25_words_maze;

/**
 * @program: StructAlgorithm
 * @ClassName BacktrackingS1D25
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-49
 * @Version 1.0
 **/
public class BacktrackingS1D25 {

    public boolean wordPuzzle(char[][] grid, String word) {
        int h = grid.length, w = grid[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = exist(grid, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] grid, boolean[][] visited, int i, int j, String s, int k) {
        if (grid[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < grid.length && newj >= 0 && newj < grid[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = exist(grid, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }

}
