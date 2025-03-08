package com.wclass.structalgorithm.sort.heap;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

public class HeapSort {

    // 堆排序额外空间复杂度O(1)
    public static void heapSort(int[] array) {
        // 数组为null或者元素只有一个没必要排序
        if (array == null || array.length < 2) {
            return;
        }

        // O(N)
        // 逐个元素堆化，使得数组满足堆的性质
        for (int i = array.length - 1; i >= 0; i--) {
            heapify(array, i, array.length);
        }
        int heapSize = array.length;
        //
        swap(array, 0, --heapSize);
        // O(N*logN)
        while (heapSize > 0) { // O(N)
            heapify(array, 0, heapSize); // O(logN)
            swap(array, 0, --heapSize); // O(1)
        }
    }

    // array[index]刚来的数，往上
    public static void heapInsert(int[] array, int index) {
        while (array[index] > array[(index - 1) / 2]) {
            swap(array, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // array[index]位置的数，能否往下移动
    public static void heapify(int[] array, int index, int heapSize) {
        int left = index * 2 + 1; // 左孩子的下标
        while (left < heapSize) { // 下方还有孩子的时候
            // 两个孩子中，谁的值大，把下标给largest
            // 1）只有左孩子，left -> largest
            // 2) 同时有左孩子和右孩子，右孩子的值<= 左孩子的值，left -> largest
            // 3) 同时有左孩子和右孩子并且右孩子的值 > 左孩子的值， right -> largest
            int largest = left + 1 < heapSize && array[left + 1] > array[left] ? left + 1 : left;
            // 父和较大的孩子之间，谁的值大，把下标给largest
            largest = array[largest] > array[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(array, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    // for test
    // for test
    public static void main(String[] args) {
        TimesUtil.test("堆排序:", new TimesUtil.Task() {
            @Override
            public void execute() {
                int[] orginNums = {1,2,6,8,2,4};
                System.out.println(Arrays.toString(orginNums));
                heapSort(orginNums);
                System.out.println(Arrays.toString(orginNums));
            }
        });
    }
}
