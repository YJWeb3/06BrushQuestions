package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d36_bit_counting‌;

/**
 * @program: StructAlgorithm
 * @ClassName MostSignificantBitS1D36
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-46
 * @Version 1.0
 **/
public class MostSignificantBitS1D36 {

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }

}
