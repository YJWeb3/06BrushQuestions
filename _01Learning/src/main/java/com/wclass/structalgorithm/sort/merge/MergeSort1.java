package com.wclass.structalgorithm.sort.merge;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:MergeSort1
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/23 17:35
 * @Author:NieZheng
 * @Version:1.0
 */
public class MergeSort1 {

    // 递归方法实现
    public static void mergeSort(int[] arr) {
        // 数组为null或者元素只有一个没必要排序
        if (arr == null || arr.length < 2) {
            return;
        }
        // 不满足以上条件进一步处理
        process(arr, 0, arr.length - 1);
    }

    // 请把arr[L..R]排有序
    // l...r N
    // T(N) = 2 * T(N / 2) + O(N)
    // O(N * logN)
    public static void process(int[] arr, int L, int R) {
        // 左边界等于右边界，已经到最后一个元素
        if (L == R) { // base case
            return;
        }
        // 找到中间位置
        int mid = L + ((R - L) >> 1);
        // 拆分成小问题
        process(arr, L, mid);
        process(arr, mid + 1, R);
        // 每一次小问题处理完毕后，最终会合并成上一个大问题的小问题。
        merge(arr, L, mid, R);
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
        // 迭代辅助数组赋值到原数组
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("基于递归的归并排序:", new TimesUtil.Task() {
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
