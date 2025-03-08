package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d77_MyQueue
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 11:24
 * @Author:NieZheng
 * @Version:1.0
 */

class Node{
    public int val;
    public Node next,prev;
    public Node(int x){
        val = x;
        prev = next = null;
    }
}

interface InterfaceQueue{
    void push(int element);

    int pop();

    int top();
}

public class d77_MyQueue implements InterfaceQueue {

    public Node first,last;

    public d77_MyQueue(){

    }

    @Override
    public void push(int val) {
        if (last == null){
            last = new Node(val);
            first = last;
        }else {
            Node node = new Node(val);
            last.next = node;
            node.prev = last;
            last = last.next;
        }
    }

    @Override
    public int pop() {
        if (first != null){
            int val = first.val;
            first = first.next;
            if (first != null)
                first.prev = null;
            else
                last = null;
            return val;
        }
        return -1;
    }

    @Override
    public int top() {
        if (first != null){
            return first.val;
        }
        return -1;
    }


}


