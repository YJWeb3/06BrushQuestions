package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d32_no_overlapping_interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: StructAlgorithm
 * @ClassName DynamicS232
 * @description:
 * @author: W哥
 * @create: 2024-09-17-19-34
 * @Version 1.0
 **/
public class DynamicS232 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int n = intervals.length;
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (intervals[j][1] <= intervals[i][0]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        return n - Arrays.stream(f).max().getAsInt();
    }

}
