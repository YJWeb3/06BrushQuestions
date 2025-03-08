package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs6 {

    public static int climbStairsWithFibonacciFormula(int n) {
        double sqrt5= Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int)(fibn / sqrt5);
    }
}