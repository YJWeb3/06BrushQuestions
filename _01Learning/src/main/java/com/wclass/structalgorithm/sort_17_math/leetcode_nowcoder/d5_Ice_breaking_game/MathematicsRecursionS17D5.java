package com.wclass.structalgorithm.sort_17_math.leetcode_nowcoder.d5_Ice_breaking_game;

/**
 * @program: StructAlgorithm
 * @ClassName MathematicsRecursionS17D5
 * @description:
 * @author: W哥
 * @create: 2024-10-09-09-18
 * @Version 1.0
 **/
public class MathematicsRecursionS17D5 {

    public int iceBreakingGame(int num, int target) {
        int f = 0;
        for (int i = 2; i != num + 1; ++i) {
            f = (target + f) % i;
        }
        return f;
    }

}
