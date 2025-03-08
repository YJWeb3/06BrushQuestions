package com.wclass.structalgorithm.sort;

import java.util.Arrays;

public class d10_RadixSort {

	// only for no-negative value
	public static void radixSort(int[] arr) {
		// 数组为null或者元素只有一个没必要排序
		if (arr == null || arr.length < 2) {
			return;
		}
		// 不满足以上条件进一步处理
		radixSort(arr, 0, arr.length - 1, maxbits(arr));
	}

	// 统一最大数的位数
	public static int maxbits(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int res = 0;
		while (max != 0) {
			res++;
			max /= 10;
		}
		return res;
	}

	// arr[l..r]排序  ,  digit
	// l..r    3 56 17 100    3
	public static void radixSort(int[] arr, int L, int R, int digit) {
		// 定义一个基数
		final int radix = 10;
		int i = 0, j = 0;
		// 有多少个数准备多少个辅助空间
		int[] help = new int[R - L + 1];
		for (int d = 1; d <= digit; d++) { // 有多少位就进出几次
			// 10个桶
			int[] bucket = new int[radix]; // count[0..9]
			// 指定位时，数字等于i的有多少个
			for (i = L; i <= R; i++) {
				// 103  1   3
				// 209  1   9
				j = getDigit(arr[i], d);
				bucket[j]++;
			}
			// 前缀和累加
			// count[0] 当前位(d位)是0的数字有多少个
			// count[1] 当前位(d位)是(0和1)的数字有多少个
			// count[2] 当前位(d位)是(0、1和2)的数字有多少个
			// count[i] 当前位(d位)是(0~i)的数字有多少个
			// 这儿就是指定位时，数字小于等于i的有多少个
			for (i = 1; i < radix; i++) {
				bucket[i] = bucket[i] + bucket[i - 1];
			}
			// 从右往左看的顺序，从桶倒元素
			for (i = R; i >= L; i--) {
				// 存储到辅助空间
				j = getDigit(arr[i], d);
				help[bucket[j] - 1] = arr[i];
				// 桶倒了一个元素减少一个
				bucket[j]--;
			}
			// 迭代赋值给原数组
			for (i = L, j = 0; i <= R; i++, j++) {
				arr[i] = help[j];
			}
		}
	}

	// 获取该数字指定的位所对应的数字
	public static int getDigit(int x, int d) {
		return ((x / ((int) Math.pow(10, d - 1))) % 10);
	}

	// for test
	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random());
		}
		return arr;
	}

	// for test
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

	// for test
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

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// for test
	public static void main(String[] args) {
		int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100000;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			radixSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				succeed = false;
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);
		printArray(arr);
		radixSort(arr);
		printArray(arr);

	}

}
