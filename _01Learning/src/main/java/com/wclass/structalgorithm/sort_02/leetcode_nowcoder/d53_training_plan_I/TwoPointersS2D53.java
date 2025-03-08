package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d53_training_plan_I;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D53
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-27
 * @Version 1.0
 **/
public class TwoPointersS2D53 {

    public int[] trainingPlan(int[] actions) {
        int i = 0, j = actions.length - 1, tmp;
        while(i < j) {
            while(i < j && (actions[i] & 1) == 1) i++;
            while(i < j && (actions[j] & 1) == 0) j--;
            tmp = actions[i];
            actions[i] = actions[j];
            actions[j] = tmp;
        }
        return actions;
    }

    public int[] trainingPlan02(int[] actions) {
        int i = 0, j = actions.length - 1, tmp;
        while(i < j) {
            while(i < j && (actions[i] & 1) == 1) i++;
            while(i < j && (actions[j] & 1) == 0) j--;
            tmp = actions[i];
            actions[i] = actions[j];
            actions[j] = tmp;
        }
        return actions;
    }

}
