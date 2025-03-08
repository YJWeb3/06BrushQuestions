package com.wclass.structalgorithm.sort.quick;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

/**
 * ClassName:QuickSort3
 * Package:com.yj.nz.sort.test
 * Description:描述
 *
 * @Date:2023/3/23 17:20
 * @Author:NieZheng
 * @Version:1.0
 */
public class QuickSort3 {

    // 随机快排
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

        // 随机选取1个位置上的数换到R位置上,就是随机一个划分值
        swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
        // 等于区，荷兰国旗问题后，返回的数组
        int[] equalArea = netherlandsFlag(arr, L, R);
        // 0位置是等于M的数组部分的左下标值
        process(arr, L, equalArea[0] - 1);
        // 1位置是等于M的数组部分的右下标值
        process(arr, equalArea[1] + 1, R);
    }


    // arr[L...R] 玩荷兰国旗问题的划分，以arr[R]做划分值
    // <arr[R] ==arr[R] > arr[R]
    public static int[] netherlandsFlag(int[] arr, int L, int R) {
        // 左边界大于右边界，没必要划分了
        if (L > R) { // L...R L>R
            return new int[] { -1, -1 };
        }
        // 左边界等于右边界，返回左右边界位置
        if (L == R) {
            return new int[] { L, R };
        }
        // 以上不满足，开始荷兰国旗问题
        int less = L - 1; // < 区 右边界
        int more = R; // > 区 左边界
        int index = L;
        while (index < more) { // 当前位置，不能和 >区的左边界撞上
            if (arr[index] == arr[R]) {
                index++;
            } else if (arr[index] < arr[R]) {
                // 小于区右移一步再与当前位置交换，当前位置往后走一步
                swap(arr, index++, ++less);
            } else { // >
                // 都不满足，就是大于，右边区往左走一步再与当前位置交换
                swap(arr, index, --more);
            }
        }
        // 最终还有一个划分值需要移动到中间位置，即右边区与划分值交换位置
        swap(arr, more, R); // <[R]   =[R]   >[R]
        // 完成划分，返回一个只有两个元素的数组
        return new int[] { less + 1, more };
    }


    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 生成随机数组
     * @param maxSize 随机数组的封顶大小
     * @param maxValue 随机数值的封顶值
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static void main(String[] args) {
        TimesUtil.test("递归版本的随机快排:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginArrays = generateRandomArray(10,10);
                System.out.println(Arrays.toString(orginArrays));
                quickSort(orginArrays);
                System.out.println(Arrays.toString(orginArrays));
            }
        });
    }

}
