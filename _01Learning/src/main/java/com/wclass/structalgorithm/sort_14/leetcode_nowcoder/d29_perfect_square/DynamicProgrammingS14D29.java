package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d29_perfect_square;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D29
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-56
 * @Version 1.0
 **/
public class DynamicProgrammingS14D29 {

    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }
}
