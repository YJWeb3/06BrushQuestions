package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d48_total_cost_hire_k_workers‌;

import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleHeapS6D48
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-48
 * @Version 1.0
 **/
public class DoubleHeapS6D48 {

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();
        int l = candidates, n = costs.length, r = Math.max(l - 1, n - candidates - 1);
        long ans = 0;
        for (int i = 0; i < candidates; i++) q1.add(costs[i]);
        for (int i = n - 1; i > r; i--) q2.add(costs[i]);
        while (k-- > 0) {
            if (!q1.isEmpty() && !q2.isEmpty()) {
                if (q1.peek() <= q2.peek()) {
                    ans += q1.poll();
                    if (l <= r) q1.add(costs[l++]);
                } else {
                    ans += q2.poll();
                    if (l <= r) q2.add(costs[r--]);
                }
            } else if(q2.isEmpty()) {
                ans += q1.poll();
                if (l <= r) q1.add(costs[l++]);
            } else if (q1.isEmpty()) {
                ans += q2.poll();
                if (l <= r) q2.add(costs[r--]);
            }
        }
        return ans;
    }

}
