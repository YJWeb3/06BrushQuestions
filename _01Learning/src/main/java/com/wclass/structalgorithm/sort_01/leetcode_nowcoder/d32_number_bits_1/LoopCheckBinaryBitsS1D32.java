package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d32_number_bits_1;

/**
 * @program: StructAlgorithm
 * @ClassName LoopCheckBinaryBitsS1D32
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-39
 * @Version 1.0
 **/
public class LoopCheckBinaryBitsS1D32 {

    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

}
