package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d32_no_overlapping_interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: StructAlgorithm
 * @ClassName GreedyS232
 * @description:
 * @author: W哥
 * @create: 2024-09-17-19-34
 * @Version 1.0
 **/
public class GreedyS232 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] >= right) {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }

}
