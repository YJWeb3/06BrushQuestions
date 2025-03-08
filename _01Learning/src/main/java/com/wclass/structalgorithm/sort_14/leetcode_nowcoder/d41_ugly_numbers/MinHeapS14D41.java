package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d41_ugly_numbers;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName MinHeapS14D41
 * @description:
 * @author: W哥
 * @create: 2024-09-22-18-06
 * @Version 1.0
 **/
public class MinHeapS14D41 {

    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }

}
