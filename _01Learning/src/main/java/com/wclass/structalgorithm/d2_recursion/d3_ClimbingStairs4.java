package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs4 {

    public static int climbStairsWithFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second =third;
        }

        return second;
    }
}

