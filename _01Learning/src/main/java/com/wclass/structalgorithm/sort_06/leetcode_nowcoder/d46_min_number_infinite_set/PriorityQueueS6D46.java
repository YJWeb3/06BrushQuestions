package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d46_min_number_infinite_set;

import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS6D46
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-46
 * @Version 1.0
 **/
public class PriorityQueueS6D46 {

    PriorityQueue<Integer> queue;
    int index;
    
    public PriorityQueueS6D46() {
        queue = new PriorityQueue<Integer>();
        index = 0;
    }

    public int popSmallest() {
        if(!queue.isEmpty()){
            return queue.peek() > index ? ++index: queue.poll();
        }
        return ++index;
    }

    public void addBack(int num) {
        if (!queue.contains(num) && index >= num) {
            queue.offer(num);
        }
    }

}
