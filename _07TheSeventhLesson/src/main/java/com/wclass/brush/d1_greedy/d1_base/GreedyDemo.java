package com.wclass.brush.d1_greedy.d1_base;

/**
 * @program: 06BrushQuestions
 * @ClassName GreedyDemo
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-18-06
 * @Version 1.0
 **/
import java.util.*;

class Activity {
    int start;
    int end;
    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class GreedyDemo {
    // 贪心算法实现：按结束时间升序选择活动
    public static List<Activity> selectActivities(List<Activity> activities) {
        activities.sort(Comparator.comparingInt(a -> a.end)); // 按结束时间排序
        List<Activity> result = new ArrayList<>();
        if (activities.isEmpty()) return result;

        Activity last = activities.get(0);
        result.add(last);
        for (int i = 1; i < activities.size(); i++) {
            Activity curr = activities.get(i);
            if (curr.start >= last.end) { // 无冲突则选择
                result.add(curr);
                last = curr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(1, 4), new Activity(3, 5), new Activity(0, 6),
                new Activity(5, 7), new Activity(3, 8), new Activity(5, 9)
        );
        List<Activity> selected = selectActivities(activities);
        System.out.println("最大活动数量：" + selected.size()); // 输出3
    }
}