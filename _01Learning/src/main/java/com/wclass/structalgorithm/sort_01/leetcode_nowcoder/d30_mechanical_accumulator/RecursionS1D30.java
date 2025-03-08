package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d30_mechanical_accumulator;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS1D30
 * @description:
 * @author: W哥
 * @create: 2024-09-11-21-57
 * @Version 1.0
 **/
public class RecursionS1D30 {

    public int mechanicalAccumulator(int target) {
        boolean flag = target > 0 && (target += mechanicalAccumulator(target - 1)) > 0;
        return target;
    }

}
