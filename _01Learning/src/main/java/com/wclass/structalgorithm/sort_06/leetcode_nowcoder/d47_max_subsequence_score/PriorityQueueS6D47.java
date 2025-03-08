package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d47_max_subsequence_score;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS6D47
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-47
 * @Version 1.0
 **/
public class PriorityQueueS6D47 {

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long ans = 0L;
        Integer[] sorts = new Integer[n];
        for(int i = 0; i < n; i++) sorts[i] = i;
        Arrays.sort(sorts,(a, b)->nums2[b]-nums2[a]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0L;
        for(int i = 0; i < k-1; i++){
            sum += nums1[sorts[i]];
            pq.offer(nums1[sorts[i]]);
        }

        for(int i = k-1; i < n; i++){
            sum += nums1[sorts[i]];
            pq.offer(nums1[sorts[i]]);
            ans = Math.max(ans,nums2[sorts[i]]*sum);
            sum -= pq.poll();
        }

        return ans;
    }
}
