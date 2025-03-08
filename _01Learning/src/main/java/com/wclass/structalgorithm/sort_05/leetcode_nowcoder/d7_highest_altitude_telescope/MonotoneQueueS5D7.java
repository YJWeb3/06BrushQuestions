package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d7_highest_altitude_telescope;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName MonotoneQueueS5D7‌
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-38
 * @Version 1.0
 **/
public class MonotoneQueueS5D7 {

    public int[] maxAltitude(int[] heights, int limit) {
        int n = heights.length;
        if(n==0){
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < limit; ++i) {
            while (!deque.isEmpty() && heights[i] >= heights[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - limit + 1];
        ans[0] = heights[deque.peekFirst()];
        for (int i = limit; i < n; ++i) {
            while (!deque.isEmpty() && heights[i] >= heights[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - limit) {
                deque.pollFirst();
            }
            ans[i - limit + 1] = heights[deque.peekFirst()];
        }
        return ans;
    }

}
