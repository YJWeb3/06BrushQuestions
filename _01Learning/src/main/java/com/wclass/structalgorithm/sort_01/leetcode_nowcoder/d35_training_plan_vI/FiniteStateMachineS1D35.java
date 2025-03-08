package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d35_training_plan_vI;

/**
 * @program: StructAlgorithm
 * @ClassName FiniteStateMachineS1D35
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-44
 * @Version 1.0
 **/
public class FiniteStateMachineS1D35 {

    public int trainingPlan(int[] actions) {
        int ones = 0, twos = 0;
        for(int action : actions){
            ones = ones ^ action & ~twos;
            twos = twos ^ action & ~ones;
        }
        return ones;
    }

}
