package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d23_d22_impl_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleQueue
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-20
 * @Version 1.0
 **/
public class DoubleQueueS5D23 {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public DoubleQueueS5D23() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }

}
