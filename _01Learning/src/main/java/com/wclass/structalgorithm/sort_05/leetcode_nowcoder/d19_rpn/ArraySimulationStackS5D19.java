package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d19_rpn;

/**
 * @program: StructAlgorithm
 * @ClassName ArraySimulationStackS5D19
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-15
 * @Version 1.0
 **/
public class ArraySimulationStackS5D19 {

    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int[] stack = new int[(n + 1) / 2];
        int index = -1;
        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            switch (token) {
                case "+":
                    index--;
                    stack[index] += stack[index + 1];
                    break;
                case "-":
                    index--;
                    stack[index] -= stack[index + 1];
                    break;
                case "*":
                    index--;
                    stack[index] *= stack[index + 1];
                    break;
                case "/":
                    index--;
                    stack[index] /= stack[index + 1];
                    break;
                default:
                    index++;
                    stack[index] = Integer.parseInt(token);
            }
        }
        return stack[index];
    }

}
