package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d36_bit_counting‌;

/**
 * @program: StructAlgorithm
 * @ClassName BrianKernighanS1D36
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-46
 * @Version 1.0
 **/
public class BrianKernighanS1D36 {

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }

}
