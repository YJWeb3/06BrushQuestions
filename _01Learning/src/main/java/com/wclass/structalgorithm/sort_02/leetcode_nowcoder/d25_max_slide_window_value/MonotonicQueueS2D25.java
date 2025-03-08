package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d25_max_slide_window_value;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName MonotonicQueueS2D25
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-16
 * @Version 1.0
 **/
public class MonotonicQueueS2D25 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

}
