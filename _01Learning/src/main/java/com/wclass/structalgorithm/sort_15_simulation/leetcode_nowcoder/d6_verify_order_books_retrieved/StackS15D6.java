package com.wclass.structalgorithm.sort_15_simulation.leetcode_nowcoder.d6_verify_order_books_retrieved;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS15D6
 * @description:
 * @author: W哥
 * @create: 2024-10-09-08-22
 * @Version 1.0
 **/
public class StackS15D6 {

    public boolean validateBookSequences(int[] putIn, int[] takeOut) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : putIn) {
            stack.push(num); // num 入栈
            while(!stack.isEmpty() && stack.peek() == takeOut[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

}
