package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d19_rpn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName StackS5D19
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-13
 * @Version 1.0
 **/
public class StackS5D19 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<Integer>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

}
