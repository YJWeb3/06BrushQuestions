package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d35_longest_valid_parentheses‌;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName StackS14D35
 * @description:
 * @author: W哥
 * @create: 2024-09-22-16-17
 * @Version 1.0
 **/
public class StackS14D35 {

    public int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
