package com.wclass.structalgorithm.zijie;

import java.util.Stack;

/**
 * ClassName:d106_MinStack
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/23 23:49
 * @Author:NieZheng
 * @Version:1.0
 */
public class d106_MinStack {

    Stack<Integer> stack,minStack;

    public d106_MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int number){
        stack.push(number);
        if (minStack.empty() || number < minStack.peek()){
            minStack.push(number);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public int pop(){
        minStack.pop();
        return stack.pop();
    }

    public int min(){
        return minStack.peek();
    }
}
