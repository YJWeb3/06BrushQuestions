package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d2_host_scheduling;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortTraverseS14D2
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-39
 * @Version 1.0
 **/
public class SortTraverseS14D2 {

    public int minmumNumberOfHost (int n, int[][] startEnd) {
        int[] start = new int[n];
        int[] end = new int[n];
        //分别得到活动起始时间
        for(int i = 0; i < n; i++){
            start[i] = startEnd[i][0];
            end[i] = startEnd[i][1];
        }
        //单独排序
        Arrays.sort(start, 0, start.length);
        Arrays.sort(end, 0, end.length);
        int res = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            //新开始的节目大于上一轮结束的时间，主持人不变
            if(start[i] >= end[j])
                j++;
            else
                //主持人增加
                res++;
        }
        return res;
    }

}
