package com.wclass.structalgorithm.d2_recursion;

public class d3_ClimbingStairs2 {

    public static int climbStairsWithRecursionMemory(int n) {
        int[] memoryArray = new int[n + 1];
        return subClimbStairsWithRecursionMemory(n - 1, memoryArray) + subClimbStairsWithRecursionMemory(n - 2, memoryArray);

    }

    public static int subClimbStairsWithRecursionMemory(int n, int[] memoryArray) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            if (memoryArray[n] > 0) {
                return memoryArray[n];
            }
            memoryArray[n] = subClimbStairsWithRecursionMemory(n - 1, memoryArray) + subClimbStairsWithRecursionMemory(n - 2, memoryArray);

            return memoryArray[n];
        }
    }
}
