package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d3_integer_partition;

/**
 * @program: StructAlgorithm
 * @ClassName MathS17D3
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-43
 * @Version 1.0
 **/
public class MathS17D3 {

    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) Math.pow(3, quotient);
        } else if (remainder == 1) {
            return (int) Math.pow(3, quotient - 1) * 4;
        } else {
            return (int) Math.pow(3, quotient) * 2;
        }
    }

}
