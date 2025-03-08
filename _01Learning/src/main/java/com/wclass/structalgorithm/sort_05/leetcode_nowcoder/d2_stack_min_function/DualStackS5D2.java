package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d2_stack_min_function;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleStackS5D2
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-24
 * @Version 1.0
 **/
public class DualStackS5D2 {

    //用于栈的push 与 pop
    Stack<Integer> s1 = new Stack<Integer>();

    //用于存储最小min
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int node) {
        s1.push(node);
        //空或者新元素较小，则入栈
        if(s2.isEmpty() || s2.peek() > node)
            s2.push(node);
        else
            //重复加入栈顶
            s2.push(s2.peek());
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }

}
