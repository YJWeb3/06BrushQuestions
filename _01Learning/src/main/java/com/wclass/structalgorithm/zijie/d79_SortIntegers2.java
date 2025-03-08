package com.wclass.structalgorithm.zijie;

import java.util.Arrays;

/**
 * ClassName:d79_SortIntegers2
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 11:44
 * @Author:NieZheng
 * @Version:1.0
 */
public class d79_SortIntegers2 {

    private int[] tmp;


    // 快排
    public int[] sortIntegers1(int[] nums){
      quickSort(nums,0,nums.length - 1);
        return nums;
    }
    private void quickSort(int[] A, int start, int end) {
        if (start >= end){
            return;
        }

        int left = start,right = end;
        int pivot = A[(start + end) / 2];
        while (left <= right){
            while(left <= right && A[left] < pivot){
                left++;
            }
            while(left <= right && A[right] > pivot){
                right--;
            }
            if (left <= right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }
        }
        quickSort(A,start,right);
        quickSort(A,left,end);
    }
}
