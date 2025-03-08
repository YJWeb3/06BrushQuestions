package com.wclass.structalgorithm.sort;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:d4_ShellSort
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/11 0:04
 * @Author:NieZheng
 * @Version:1.0
 */
public class d4_ShellSort {

    public static void shellSort(int[] array){
        // 数组为null或者元素只有一个没必要排序
        if (array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        // 当然gap的区间不固定,也可以为3，这里我是以2为准
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // i 代表待插入元素的索引
            for (int i = gap; i < n; i++) {
                int t = array[i]; // 代表待插入的元素值
                int j = i;
                while (j >= gap) {
                    // 每次与上一个间隙为 gap 的元素进行插入排序
                    if (t < array[j - gap]) { // j-gap 是上一个元素索引，如果 > t，后移
                        array[j] = array[j - gap];
                        j -= gap;
                    } else { // 如果 j-1 已经 <= t, 则 j 就是插入位置
                        break;
                    }
                }
                array[j] = t;
            }
        }
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("gap为2的希尔排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(Arrays.toString(orginNums));
                shellSort(orginNums);
                System.out.println(Arrays.toString(orginNums));
            }
        });
    }

}
