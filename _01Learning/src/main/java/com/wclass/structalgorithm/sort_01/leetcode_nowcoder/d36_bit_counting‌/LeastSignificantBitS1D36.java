package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d36_bit_counting‌;

/**
 * @program: StructAlgorithm
 * @ClassName LeastSignificantBit
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-47
 * @Version 1.0
 **/
public class LeastSignificantBitS1D36 {

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }

}
