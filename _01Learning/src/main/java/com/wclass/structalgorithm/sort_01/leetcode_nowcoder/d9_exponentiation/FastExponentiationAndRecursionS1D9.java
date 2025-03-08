package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d9_exponentiation;

/**
 * @program: StructAlgorithm
 * @ClassName FastExponentiationAndRecursionS1D8
 * @description:
 * @author: W哥
 * @create: 2024-09-08-00-52
 * @Version 1.0
 **/
public class FastExponentiationAndRecursionS1D9 {

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

}
