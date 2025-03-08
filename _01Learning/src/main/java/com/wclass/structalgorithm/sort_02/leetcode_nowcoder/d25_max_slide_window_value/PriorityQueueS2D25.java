package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d25_max_slide_window_value;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS2D25
 * @description:
 * @author: W哥
 * @create: 2024-09-16-21-16
 * @Version 1.0
 **/
public class PriorityQueueS2D25 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }

}
