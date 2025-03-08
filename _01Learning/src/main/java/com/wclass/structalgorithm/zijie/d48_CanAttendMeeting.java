package com.wclass.structalgorithm.zijie;

import java.util.*;

/**
 * ClassName:d48_CanAttendMeeting
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 11:58
 * @Author:NieZheng
 * @Version:1.0
 */
public class d48_CanAttendMeeting {

    public class Interval{
        int start,end;
        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    public boolean canAttendMeeting(Interval[] intervals){
        if (intervals == null || intervals.length == 0) return true;
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        int end = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < end){
                return false;
            }
            end = Math.max(end,intervals[i].end);
        }
        return true;
    }

    public boolean canAttenMeeting2(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2){
                return i1.start - i2.start;
            }
        });
        for (int i = 0; i < intervals.size() - 1; i++)
            if (intervals.get(i).end > intervals.get(i + 1).start){
                return false;
            }
            return true;
    }
}
