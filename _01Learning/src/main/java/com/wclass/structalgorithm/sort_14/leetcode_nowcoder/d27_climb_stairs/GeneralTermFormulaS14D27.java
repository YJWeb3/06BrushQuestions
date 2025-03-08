package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d27_climb_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName GeneralTermFormulaS14D27
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-54
 * @Version 1.0
 **/
public class GeneralTermFormulaS14D27 {

    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) Math.round(fibn / sqrt5);
    }

}
