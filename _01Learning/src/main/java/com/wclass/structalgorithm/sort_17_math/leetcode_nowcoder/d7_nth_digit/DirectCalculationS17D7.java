package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d7_nth_digit;

/**
 * @program: StructAlgorithm
 * @ClassName DirectCalculationS17D7
 * @description:
 * @author: W哥
 * @create: 2024-10-09-09-25
 * @Version 1.0
 **/
public class DirectCalculationS17D7 {

    public int findNthDigit(int n) {
        int d = 1, count = 9;
        while (n > (long) d * count) {
            n -= d * count;
            d++;
            count *= 10;
        }
        int index = n - 1;
        int start = (int) Math.pow(10, d - 1);
        int num = start + index / d;
        int digitIndex = index % d;
        int digit = (num / (int)(Math.pow(10, d - digitIndex - 1))) % 10;
        return digit;
    }

}
