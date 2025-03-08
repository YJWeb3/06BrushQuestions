package com.wclass.structalgorithm.sort_06.leetcode_nowcoder.d45_median_data_flow;


import java.util.TreeMap;

/**
 * @program: StructAlgorithm
 * @ClassName OrderedSetTwoPointersS6D45
 * @description:
 * @author: W哥
 * @create: 2024-09-28-20-41
 * @Version 1.0
 **/
public class OrderedSetTwoPointersS6D45 {

    TreeMap<Integer, Integer> nums;
    int n;
    int[] left;
    int[] right;

    public OrderedSetTwoPointersS6D45() {
        nums = new TreeMap<Integer, Integer>();
        n = 0;
        left = new int[2];
        right = new int[2];
    }

    public void addNum(int num) {
        nums.put(num, nums.getOrDefault(num, 0) + 1);
        if (n == 0) {
            left[0] = right[0] = num;
            left[1] = right[1] = 1;
        } else if ((n & 1) != 0) {
            if (num < left[0]) {
                decrease(left);
            } else {
                increase(right);
            }
        } else {
            if (num > left[0] && num < right[0]) {
                increase(left);
                decrease(right);
            } else if (num >= right[0]) {
                increase(left);
            } else {
                decrease(right);
                System.arraycopy(right, 0, left, 0, 2);
            }
        }
        n++;
    }

    public double findMedian() {
        return (left[0] + right[0]) / 2.0;
    }

    private void increase(int[] iterator) {
        iterator[1]++;
        if (iterator[1] > nums.get(iterator[0])) {
            iterator[0] = nums.ceilingKey(iterator[0] + 1);
            iterator[1] = 1;
        }
    }

    private void decrease(int[] iterator) {
        iterator[1]--;
        if (iterator[1] == 0) {
            iterator[0] = nums.floorKey(iterator[0] - 1);
            iterator[1] = nums.get(iterator[0]);
        }
    }

}


