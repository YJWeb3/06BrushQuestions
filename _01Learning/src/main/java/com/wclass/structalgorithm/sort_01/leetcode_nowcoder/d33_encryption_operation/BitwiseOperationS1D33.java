package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d33_encryption_operation;

/**
 * @program: StructAlgorithm
 * @ClassName BitwiseOperationS1D33
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-42
 * @Version 1.0
 **/
public class BitwiseOperationS1D33 {

    public int encryptionCalculate(int dataA, int dataB) {
        while(dataB != 0) { // 当进位为 0 时跳出
            int c = (dataA & dataB) << 1;  // c = 进位
            dataA ^= dataB; // dataA = 非进位和
            dataB = c; // dataB = 进位

        }
        return dataA;
    }

}
