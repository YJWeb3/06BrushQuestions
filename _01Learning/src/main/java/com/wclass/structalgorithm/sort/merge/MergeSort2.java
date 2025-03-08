package com.wclass.structalgorithm.sort.merge;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:MergeSort2
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/23 17:55
 * @Author:NieZheng
 * @Version:1.0
 */
public class MergeSort2 {

    // 非递归方法实现
    public static void mergeSort(int[] arr) {
        // 数组为null或者元素只有一个没必要排序
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 步长
        int mergeSize = 1;
        // 步长小于数组长度，意味着可以走
        while (mergeSize < N) { // log N
            // 当前左组的，第一个位置
            int L = 0;
            while (L < N) {
                // 循环边界条件，步长大于剩余区域长度，没必要继续走下去
                if (mergeSize >= N - L) {
                    break;
                }
                // 中间区域
                int M = L + mergeSize - 1;
                // 确定右边区域
                int R = M + Math.min(mergeSize, N - M - 1);
                // 归并小问题
                merge(arr, L, M, R);
                // 开始下一个小问题
                L = R + 1;
            }
            // 防止溢出
            if (mergeSize > N / 2) {
                break;
            }
            // 步长成倍增加
            mergeSize <<= 1;
        }
    }

    // 归并小问题
    public static void merge(int[] arr, int L, int M, int R) {
        // 构造一个能存放该区域元素的辅助数组
        int[] help = new int[R - L + 1];
        int i = 0;
        // 左区域的第一个元素
        int p1 = L;
        // 右区域的第一个元素
        int p2 = M + 1;
        // 右区域开始
        while (p1 <= M && p2 <= R) {
            // 左右区域的元素依次比较后再进行赋值,然后移动位置
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 要么p1越界了，要么p2越界了
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("基于非递归的归并排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(Arrays.toString(orginNums));
                mergeSort(orginNums);
                System.out.println(Arrays.toString(orginNums));
            }
        });
    }

}
