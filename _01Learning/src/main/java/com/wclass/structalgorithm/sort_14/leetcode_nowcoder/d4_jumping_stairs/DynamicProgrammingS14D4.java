package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d4_jumping_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicProgrammingS14D4
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-45
 * @Version 1.0
 **/
public class DynamicProgrammingS14D4 {

    public int jumpFloor(int target) {
        //从0开始，第0项是1，第一项是1
        if (target <= 1)
            return 1;
        int[] temp = new int[target + 1];
        //初始化
        temp[0] = 1;
        temp[1] = 1;
        //遍历相加
        for (int i = 2; i <= target; i++)
            temp[i] = temp[i - 1] + temp[i - 2];
        return temp[target];
    }

}
