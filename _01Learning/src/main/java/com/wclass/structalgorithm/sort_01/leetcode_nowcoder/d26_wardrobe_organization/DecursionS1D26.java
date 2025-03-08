package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d26_wardrobe_organization;

/**
 * @program: StructAlgorithm
 * @ClassName DecursionS1D26
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-51
 * @Version 1.0
 **/
public class DecursionS1D26 {

    public int wardrobeFinishing(int m, int n, int cnt) {
        if (cnt == 0) {
            return 1;
        }
        boolean[][] vis = new boolean[m][n];
        int ans = 1;
        vis[0][0] = true;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((i == 0 && j == 0) || get(i) + get(j) > cnt) {
                    continue;
                }
                // 边界判断
                if (i - 1 >= 0) {
                    vis[i][j] |= vis[i - 1][j];
                }
                if (j - 1 >= 0) {
                    vis[i][j] |= vis[i][j - 1];
                }
                ans += vis[i][j] ? 1 : 0;
            }
        }
        return ans;
    }

    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

}
