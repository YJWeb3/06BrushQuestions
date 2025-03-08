package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d2_host_scheduling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName OverloadedSortLargeTopHeapS14D2
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-40
 * @Version 1.0
 **/
public class OverloadedSortLargeTopHeapS14D2 {

    public int minmumNumberOfHost (int n, int[][] startEnd) {
        int A[] = new int[n];
        int k = 0;
        //按列排序，按开始时间递增排
        Arrays.sort(startEnd, new Comparator<Object>() {
            public int compare(Object o1,Object o2) {
                int[] one = (int[]) o1;
                int[] two = (int[]) o2;
                if(one[0]>two[0]) return 1;
                if(one[0]==two[0]) return 0;
                else return -1;
            }
        });
        //小顶堆
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        //可能有负区间
        q.offer(Integer.MIN_VALUE);
        for(int i = 0; i < n; i++){
            //最近的活动结束时间小于当前活动开始时间
            if(q.peek() <= startEnd[i][0])
                q.poll();
            q.offer(startEnd[i][1]);
        }
        //剩余的活动等于主持人数
        return q.size();
    }

}
