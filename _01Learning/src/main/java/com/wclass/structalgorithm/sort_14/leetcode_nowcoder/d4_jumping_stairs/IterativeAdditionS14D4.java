package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d4_jumping_stairs;

/**
 * @program: StructAlgorithm
 * @ClassName IterativeAdditionS14D4
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-43
 * @Version 1.0
 **/
public class IterativeAdditionS14D4 {

    public int jumpFloor(int target) {
        //从0开始，第0项是0，第一项是1
        if(target <= 1)
            return 1;
        int res = 0;
        int a = 0;
        int b = 1;
        //因n=2时也为1，初始化的时候把a=0，b=1
        for(int i = 2; i <= target; i++){
            //第三项开始是前两项的和,然后保留最新的两项，更新数据相加
            res = (a + b);
            a = b;
            b = res;
        }
        return res;
    }

}
