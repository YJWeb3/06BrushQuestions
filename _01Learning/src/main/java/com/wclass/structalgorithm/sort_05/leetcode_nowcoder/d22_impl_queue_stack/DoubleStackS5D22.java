package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d22_impl_queue_stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleStackS5D22
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-19
 * @Version 1.0
 **/
public class DoubleStackS5D22 {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public DoubleStackS5D22() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
