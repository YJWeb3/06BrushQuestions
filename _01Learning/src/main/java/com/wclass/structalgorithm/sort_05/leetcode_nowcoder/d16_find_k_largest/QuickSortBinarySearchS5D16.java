package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d16_find_k_largest;

import java.util.Random;

/**
 * @program: StructAlgorithm
 * @ClassName QuickSortBinarySearchS5D16
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-07
 * @Version 1.0
 **/
public class QuickSortBinarySearchS5D16 {

    //交换函数
    Random r = new Random();
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int partition(int[] a, int low, int high, int k){
        //随机快排划分
        int x = Math.abs(r.nextInt()) % (high - low + 1) + low;
        swap(a, low, x);
        int v = a[low];
        int i = low + 1;
        int j = high;
        while(true){
            //小于标杆的在右
            while(j >= low + 1 && a[j] < v)
                j--;
            //大于标杆的在左
            while(i <= high && a[i] > v)
                i++;
            if(i > j)
                break;
            swap(a, i, j);
            i++;
            j--;
        }
        swap(a, low, j);
        //从0开始，所以为第j+1大
        if(j + 1 == k)
            return a[j];
            //继续划分
        else if(j + 1 < k)
            return partition(a, j + 1, high, k);
        else
            return partition(a, low, j - 1, k);
    }
    public int findKth(int[] a, int n, int K) {
        return partition(a, 0, n - 1, K);
    }

}
