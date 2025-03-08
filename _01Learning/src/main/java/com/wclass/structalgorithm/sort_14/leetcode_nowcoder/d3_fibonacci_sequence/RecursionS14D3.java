package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d3_fibonacci_sequence;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS14D3
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-42
 * @Version 1.0
 **/
public class RecursionS14D3 {

    public int Fibonacci(int n) {
        //从0开始，第0项是0，第一项是1
        if (n <= 1)
            return n;
        else{
            //根据公式递归调用函数
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}
