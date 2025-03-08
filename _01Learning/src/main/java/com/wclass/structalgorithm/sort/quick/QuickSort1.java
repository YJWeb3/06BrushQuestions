package com.wclass.structalgorithm.sort.quick;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

public class QuickSort1 {

    public static void quickSort(int[] arr) {
        // 数组为null或者元素只有一个没必要排序
        if (arr == null || arr.length < 2) {
            return;
        }
        // 不只1个数，进一步处理
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        // 递归终止条件
        if (L >= R) {
            return;
        }
        // 分值
        int M = partition(arr, L, R);
        // 左区域进一步处理
        process(arr, L, M - 1);
        // 右区域进一步处理
        process(arr, M + 1, R);
    }

    // 只有一个小于区，以arr[R]做划分值
    public static int partition(int[] arr, int L, int R) {
        // 左边界不能小于右边界
        if (L > R) {
            return -1;
        }
        // 左边界等于右边界，结束，说明区域分到只剩一个元素
        if (L == R) {
            return L;
        }

        // 小于等于区
        int lessEqual = L - 1;
        int index = L;
        // 迭代
        while (index < R) {
            if (arr[index] <= arr[R]) {
                // 小于等于区右移，交换
                swap(arr, index, ++lessEqual);
            }
            index++;
        }
        // 右边界作为划分值，最终需要交换到左区域最后一个位置
        swap(arr, ++lessEqual, R);
        return lessEqual;
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("基于递归版本的快速排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(Arrays.toString(orginNums));
                quickSort(orginNums);
                System.out.println(Arrays.toString(orginNums));
            }
        });
    }
}
