package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d3_inventory_management_III;

import java.util.Random;

/**
 * @program: StructAlgorithm
 * @ClassName QuicksortThinkingS13D3
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-13
 * @Version 1.0
 **/
public class QuicksortThinkingS13D3 {

    public int[] inventoryManagement(int[] stock, int cnt) {
        randomizedSelected(stock, 0, stock.length - 1, cnt);
        int[] vec = new int[cnt];
        for (int i = 0; i < cnt; ++i) {
            vec[i] = stock[i];
        }
        return vec;
    }

    private void randomizedSelected(int[] stock, int l, int r, int cnt) {
        if (l >= r) {
            return;
        }
        int pos = randomizedPartition(stock, l, r);
        int num = pos - l + 1;
        if (cnt == num) {
            return;
        } else if (cnt < num) {
            randomizedSelected(stock, l, pos - 1, cnt);
        } else {
            randomizedSelected(stock, pos + 1, r, cnt - num);
        }
    }

    // 基于随机的划分
    private int randomizedPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, r, i);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l - 1;
        for (int j = l; j <= r - 1; ++j) {
            if (nums[j] <= pivot) {
                i = i + 1;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, r);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
