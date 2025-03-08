package com.wclass.structalgorithm.sort;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;

public class d8_BucketSort {

	public static void bucketSort(int[] arr) {
		// 数组为null或者元素只有一个没必要排序
		if (arr == null || arr.length < 2) {
			return;
		}
		// 默认最大值从Integer.MIN_VALUE开始
		int max = Integer.MIN_VALUE;
		// 找到数组中的最大值
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		// 根据最大值构建一个桶
		int[] bucket = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}
		int i = 0;
		// 从桶中拿元素排序
		for (int j = 0; j < bucket.length; j++) {
			while (bucket[j]-- > 0) {
				arr[i++] = j;
			}
		}
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("计数排序:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(Arrays.toString(orginNums));
				bucketSort(orginNums);
				System.out.println(Arrays.toString(orginNums));
			}
		});
	}
}
