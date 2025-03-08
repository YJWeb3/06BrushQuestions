package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d39_Sort
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:49
 * @Author:NieZheng
 * @Version:1.0
 */
public class d39_Sort {

    // 选择排序
    public void sortIntergers(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int minIndex = i;
            for (int j = i; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = tmp;
        }
    }

    // 选择排序2
    public void sortIntegers2(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
    }

    // 插入排序
    public void sortIntegers3(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int newVal = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > newVal) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = newVal;
        }
    }

    // 冒泡排序
    public void sortIntegers4(int[] A) {
        while(true){
            boolean exchange = false;
            for (int i = 0; i < A.length; i++) {
                if(A[i] > A[i + 1]){
                    int tmp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = tmp;
                    exchange = true;
                }
            }
            if (!exchange){
                break;
            }
        }
    }

}