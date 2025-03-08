package com.wclass.structalgorithm.sort;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:d3_InsertSort
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/10 23:43
 * @Author:NieZheng
 * @Version:1.0
 */
public class d3_InsertSort {

    public static void insertSort(int[] arr) {
        // 数组为null或者元素只有一个没必要排序
        if (arr == null || arr.length < 2) {
            return;
        }
        // 不只1个数
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }


    //    public static void swap(int[] array, int i, int j) {
//        int t = array[i];
//        array[i] = array[j];
//        array[j] = t;
//    }

    // 位运算形式：i和j是一个位置的话，会出错
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }




    // for test
    public static void main(String[] args) {
        TimesUtil.test("插入排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(Arrays.toString(orginNums));
                insertSort(orginNums);
                System.out.println(Arrays.toString(orginNums));
            }
        });
    }

}
