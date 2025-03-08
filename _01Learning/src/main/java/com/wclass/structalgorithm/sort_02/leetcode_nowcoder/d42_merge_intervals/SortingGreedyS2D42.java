package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d42_merge_intervals;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.Interval;
import com.wclass.structalgorithm.zijie.d48_CanAttendMeeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: StructAlgorithm
 * @ClassName SortingGreedyS2D42
 * @description:
 * @author: W哥
 * @create: 2024-09-19-20-54
 * @Version 1.0
 **/
public class SortingGreedyS2D42 {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<>();
        //去除特殊情况
        if(intervals.size() == 0)
            return res;
        //重载比较，按照区间首排序
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2){
                if(o1.start != o2.start)
                    return o1.start - o2.start;
                else
                    return o1.end - o2.end;
            }
        });
        //放入第一个区间
        res.add(intervals.get(0));
        int count = 0;
        //遍历后续区间，查看是否与末尾有重叠
        for(int i = 1; i < intervals.size(); i++){
            Interval o1 = intervals.get(i);
            Interval origin = res.get(count);
            if(o1.start > origin.end){
                res.add(o1);
                count++;
                //区间有重叠，更新结尾
            }else{
                res.remove(count);
                Interval s = new Interval(origin.start, o1.end);
                if(o1.end < origin.end)
                    s.end = origin.end;
                res.add(s);
            }
        }
        return res;
    }

}
