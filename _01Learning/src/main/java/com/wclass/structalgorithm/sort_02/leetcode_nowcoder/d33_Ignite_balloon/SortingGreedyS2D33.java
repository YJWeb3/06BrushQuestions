package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d33_Ignite_balloon;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: StructAlgorithm
 * @ClassName SortingGreedyS2D33
 * @description:
 * @author: W哥
 * @create: 2024-09-17-19-57
 * @Version 1.0
 **/
public class SortingGreedyS2D33 {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}
