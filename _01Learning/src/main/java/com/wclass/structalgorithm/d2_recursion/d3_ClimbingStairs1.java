package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs1 {

    public static int climbStairsWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairsWithRecursion(n - 1) + climbStairsWithRecursion(n - 2);
        }
    }
}
