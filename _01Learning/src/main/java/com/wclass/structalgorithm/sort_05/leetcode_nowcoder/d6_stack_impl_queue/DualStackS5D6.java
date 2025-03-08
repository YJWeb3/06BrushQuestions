package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d6_stack_impl_queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName DualStackS5D6
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-30
 * @Version 1.0
 **/
public class DualStackS5D6 {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public DualStackS5D6() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            in2out();
        }
        return outStack.pop();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
