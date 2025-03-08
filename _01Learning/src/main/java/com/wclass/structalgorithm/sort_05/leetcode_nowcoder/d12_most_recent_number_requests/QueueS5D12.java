package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d12_most_recent_number_requests;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName QueueS5D12
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-17
 * @Version 1.0
 **/
public class QueueS5D12 {

    Queue<Integer> q;
    public QueueS5D12() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }

}
