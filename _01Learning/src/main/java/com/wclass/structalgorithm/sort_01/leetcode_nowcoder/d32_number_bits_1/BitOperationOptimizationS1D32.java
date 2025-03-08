package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d32_number_bits_1;

/**
 * @program: StructAlgorithm
 * @ClassName BitOperationOptimization
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-39
 * @Version 1.0
 **/
public class BitOperationOptimizationS1D32 {

    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;
    }

}
