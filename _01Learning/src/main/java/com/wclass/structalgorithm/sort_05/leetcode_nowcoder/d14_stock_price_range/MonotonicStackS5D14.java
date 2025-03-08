package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d14_stock_price_range;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: StructAlgorithm
 * @ClassName MonotonicStackS5D14
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-03
 * @Version 1.0
 **/
public class MonotonicStackS5D14 {

    Deque<int[]> stack;
    int idx;

    public MonotonicStackS5D14() {
        stack = new ArrayDeque<int[]>();
        stack.push(new int[]{-1, Integer.MAX_VALUE});
        idx = -1;
    }

    public int next(int price) {
        idx++;
        while (price >= stack.peek()[1]) {
            stack.pop();
        }
        int ret = idx - stack.peek()[0];
        stack.push(new int[]{idx, price});
        return ret;
    }

}
