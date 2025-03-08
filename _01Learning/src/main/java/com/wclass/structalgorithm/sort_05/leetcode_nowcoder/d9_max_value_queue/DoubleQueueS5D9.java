package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d9_max_value_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleQueueS5D9
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-13
 * @Version 1.0
 **/
public class DoubleQueueS5D9 {

    Queue<Integer> q;
    Deque<Integer> d;

    public DoubleQueueS5D9() {
        q = new LinkedList<Integer>();
        d = new LinkedList<Integer>();
    }

    public int get_max() {
        if (d.isEmpty()) {
            return -1;
        }
        return d.peekFirst();
    }

    public void add(int value) {
        while (!d.isEmpty() && d.peekLast() < value) {
            d.pollLast();
        }
        d.offerLast(value);
        q.offer(value);
    }

    public int remove() {
        if (q.isEmpty()) {
            return -1;
        }
        int ans = q.poll();
        if (ans == d.peekFirst()) {
            d.pollFirst();
        }
        return ans;
    }

}
