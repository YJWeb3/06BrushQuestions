package com.wclass.structalgorithm.util;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtil {

    /**
     * 实际工作中，采用这种交换算法，虽然位运算速度块，但是这种方便阅读，提高可读性
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * 位运算形式：i和j是一个位置的话，会出错，位运算虽然效率高，但是不方便阅读，可读性差
     * @param arr
     * @param i
     * @param j
     */
//    public static void swap(int[] arr, int i, int j) {
//        arr[i] = arr[i] ^ arr[j];
//        arr[j] = arr[i] ^ arr[j];
//        arr[i] = arr[i] ^ arr[j];
//    }


    /**
     * 打乱数组元素
     * @param array
     */
    public static void shuffle(int[] array) {
        Random random = new Random();
        int size = array.length;
        for (int i = size; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }
    }


    /**
     * 对数器，就是采用官方已经实现的规则，来判断我们自己编写的算法是否正确，这里主要是验证数组的升序规则。
     * @param arr
     */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 生成随机数组
     * @param maxSize 随机数组的封顶大小
     * @param maxValue 随机数值的封顶值
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random() [0,1)
        // Math.random() * N [0,N)
        // (int)(Math.random() * N) [0, N-1]
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            // [-? , +?]
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    /**
     * 生成随机数组，相邻数不相等
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray2(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);
            }
        }
        return arr;
    }

    /**
     * 拷贝数组
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 传入的两个数组是否相等
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印数组算法（实际工作，不要采用以下这种方式打印，以下方式会耗费大量空间，而是利用StringBuilder/StringBuffer进行拼接）
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 增强for循环形式（主要是为了给我们提供方便）
     * @param arr
     */
    public static void printArray2(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
