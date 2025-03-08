package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d4_jumping_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS14D4
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-44
 * @Version 1.0
 **/
public class RecursionS14D4 {

    public int jumpFloor(int target) {
        //这里第0项为1，第1项为1
        if(target <= 1)
            return 1;
        else
            //递归子问题相加
            return jumpFloor(target - 1) + jumpFloor(target - 2);
    }

}
