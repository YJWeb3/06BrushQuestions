package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d4_median_data_flow;

import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS13D4
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-14
 * @Version 1.0
 **/
public class PriorityQueueS13D4 {

    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;

    public PriorityQueueS13D4() {
        queMin = new PriorityQueue<Integer>((a, b) -> (b - a));
        queMax = new PriorityQueue<Integer>((a, b) -> (a - b));
    }

    public void addNum(int num) {
        if (queMin.isEmpty() || num <= queMin.peek()) {
            queMin.offer(num);
            if (queMax.size() + 1 < queMin.size()) {
                queMax.offer(queMin.poll());
            }
        } else {
            queMax.offer(num);
            if (queMax.size() > queMin.size()) {
                queMin.offer(queMax.poll());
            }
        }
    }

    public double findMedian() {
        if (queMin.size() > queMax.size()) {
            return queMin.peek();
        }
        return (queMin.peek() + queMax.peek()) / 2.0;
    }

}
