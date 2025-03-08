package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d19_keke_loves_eat_bananas;

/**
 * @program: StructAlgorithm
 * @ClassName BinarySearchS13D19
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-45
 * @Version 1.0
 **/
public class BinarySearchS13D19 {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0 ;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    public long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            int curTime = (pile + speed - 1) / speed;
            time += curTime;
        }
        return time;
    }

}
