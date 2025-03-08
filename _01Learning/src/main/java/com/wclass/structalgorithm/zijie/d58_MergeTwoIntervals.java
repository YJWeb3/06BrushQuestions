package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName:d58_MergeTwoIntervals
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 13:23
 * @Author:NieZheng
 * @Version:1.0
 */
public class d58_MergeTwoIntervals {

    public class Interval{
        int start,end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public List<Interval> merge(List<Interval> intervals){
        if (intervals.size() == 0){
            return intervals;
        }

        // 根据区间的start值排序
        intervals.sort(Comparator.comparing(i -> i.start));
        
        List<Interval> result = new ArrayList<>();
        Interval lastInterval = intervals.get(0);
        
        // 如果两端区间有交集的话，合并两段区间
        // 没有的话，将最后的区间加入答案，并令新的区间作为最后的区间
        for (Interval interval : intervals){
            if (haveIntercation(lastInterval,interval)){
                lastInterval = mergeTwoIntervals(lastInterval,interval);
            }else {
                result.add(lastInterval);
                lastInterval = interval;
            }
        }
        result.add(lastInterval);

        return result;

    }

    // 合并两段区间
    private Interval mergeTwoIntervals(Interval a, Interval b) {
        return new Interval(Math.min(a.start,b.start),Math.max(a.end,b.end));
    }


    // 判断区间是否有交集，要满足较大的start小于等于较小的end
    private boolean haveIntercation(Interval a, Interval b) {
        return Math.max(a.start,b.start) < Math.min(a.end,b.end);
    }
}
