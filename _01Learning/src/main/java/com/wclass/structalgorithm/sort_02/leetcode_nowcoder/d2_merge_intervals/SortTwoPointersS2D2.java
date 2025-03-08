package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d2_merge_intervals;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName SortTwoPointersS2D2
 * @description:
 * @author: W哥
 * @create: 2024-09-14-22-57
 * @Version 1.0
 **/
public class SortTwoPointersS2D2 {

    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[][]{};
        }
        Arrays.sort(intervals,(a, b)->{return a[0]-b[0];});
        int[][] res = new int[intervals.length][2];
        int index = 0;
        int start =intervals[0][0],end = intervals[0][1];
        //下一个数组的起始值必须要小于上一个数组的最大值才能合并
        for(int i = 1; i <intervals.length ; i++){
            //如果当前最小界比上一个的最大界小 说明可以合并 ，更新更新后的上界
            if(intervals[i][0]<=end){
                end = Math.max(intervals[i][1], end);
            }else {
                //说明不能继续合并了 ，把之前合并的结果存入结果集中
                res[index][0] = start;
                res[index][1] = end;
                index++;
                //更新start 和 end 为当前新范围
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res[index][0] = start;
        res[index][1] = end;
        return Arrays.copyOfRange(res, 0, index+1);
    }

}
