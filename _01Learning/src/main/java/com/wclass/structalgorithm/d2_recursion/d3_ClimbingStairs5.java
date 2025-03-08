package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs5 {

    public static int climbStairs(int n) {
        int a = 1, b = 1;
        while (--n > 0) {
            b = b + a;
            a = b - a;
        }

        return b;
    }
}