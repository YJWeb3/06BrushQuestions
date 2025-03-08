package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d27_climb_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D27
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-53
 * @Version 1.0
 **/
public class DynamicProgrammingS14D27 {

    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}
