package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d7_highest_altitude_telescope;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS5D7
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-51
 * @Version 1.0
 **/
public class PriorityQueueS5D7 {

    public int[] maxAltitude(int[] heights, int limit) {
        int n = heights.length;
        if(n==0){
            return new int[0];
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < limit; ++i) {
            pq.offer(new int[]{heights[i], i});
        }
        int[] ans = new int[n - limit + 1];
        ans[0] = pq.peek()[0];
        for (int i = limit; i < n; ++i) {
            pq.offer(new int[]{heights[i], i});
            while (pq.peek()[1] <= i - limit) {
                pq.poll();
            }
            ans[i - limit + 1] = pq.peek()[0];
        }
        return ans;
    }

}
