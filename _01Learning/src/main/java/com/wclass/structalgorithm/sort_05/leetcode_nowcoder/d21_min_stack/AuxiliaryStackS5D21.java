package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d21_min_stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName AuxiliaryStackS5D21
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-18
 * @Version 1.0
 **/
public class AuxiliaryStackS5D21 {

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public AuxiliaryStackS5D21() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
