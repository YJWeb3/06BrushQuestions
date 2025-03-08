package com.wclass.structalgorithm.sort_16_skill.leetcode_nowcoder.d1_number_appears_only_once;

/**
 * @program: StructAlgorithm
 * @ClassName BitwiseOperationS16D1
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-25
 * @Version 1.0
 **/
public class BitwiseOperationS16D1 {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

}
