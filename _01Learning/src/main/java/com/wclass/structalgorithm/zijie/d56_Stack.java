package com.wclass.structalgorithm.zijie;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName:d56_Stack
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 12:23
 * @Author:NieZheng
 * @Version:1.0
 */
public class d56_Stack {
    
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    public d56_Stack(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    
    public void push(int value){
        queue1.offer(value);
    }
    
    public void pop(){
        moveItems();
        queue1.poll();
        swapQueues();

    }

    private void swapQueues() {
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    private void moveItems() {
        while(queue1.size() != 1){
            queue2.offer(queue1.poll());
        }
    }


    public int top(){
        moveItems();
        int item = queue1.poll();
        swapQueues();
        queue1.offer(item);
        return item;

    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }
}
