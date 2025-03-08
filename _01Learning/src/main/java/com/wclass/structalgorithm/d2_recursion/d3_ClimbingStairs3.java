package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs3 {

    public static int climbStairsWithDynamic(int n) {
        if (n == 1) {
            return 1;
        }
        int dynamicArray[] = new int[n + 1];
        dynamicArray[1] = 1;
        dynamicArray[2] = 2;
        for (int i = 3; i <= n; i++) {
            dynamicArray[i] = dynamicArray[i - 1] + dynamicArray[i - 2];
        }

        return dynamicArray[n];
    }
}
