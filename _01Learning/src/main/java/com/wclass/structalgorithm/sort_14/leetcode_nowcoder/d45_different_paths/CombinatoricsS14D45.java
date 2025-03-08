package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d45_different_paths;

/**
 * @program: StructAlgorithm
 * @ClassName CombinatoricsS14D45
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-17
 * @Version 1.0
 **/
public class CombinatoricsS14D45 {

    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }

}
