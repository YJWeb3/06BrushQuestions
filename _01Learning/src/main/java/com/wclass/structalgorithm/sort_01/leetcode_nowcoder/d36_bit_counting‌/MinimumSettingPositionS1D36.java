package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d36_bit_counting‌;

/**
 * @program: StructAlgorithm
 * @ClassName MinimumSettingPosition
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-47
 * @Version 1.0
 **/
public class MinimumSettingPositionS1D36 {

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }

}
