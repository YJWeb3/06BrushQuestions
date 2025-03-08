package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d4_daily_temperature;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName MonotonicStackS5D4
 * @description:
 * @author: W哥
 * @create: 2024-09-24-20-27
 * @Version 1.0
 **/
public class MonotonicStackS5D4 {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }

}
