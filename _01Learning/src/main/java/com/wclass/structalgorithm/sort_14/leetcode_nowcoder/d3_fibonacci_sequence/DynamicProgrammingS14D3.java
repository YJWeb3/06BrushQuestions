package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d3_fibonacci_sequence;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D3
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-43
 * @Version 1.0
 **/
public class DynamicProgrammingS14D3 {

    public int Fibonacci(int n) {
        //从0开始，第0项是0，第一项是1
        if(n <= 1)
            return n;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        //依次相加
        for (int i = 2; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        return fib[n];
    }

}
