package com.wclass.structalgorithm.search.binarysearch;

public class d4_BSAwesome {

	public static int getLessIndex(int[] arr) {
		// 数组为null或者没有元素，没必要查找
		if (arr == null || arr.length == 0) {
			return -1;
		}
		// 如果第一个位置元素小于第二个位置的元素，第一个位置的元素局部最小
		if (arr.length == 1 || arr[0] < arr[1]) {
			return 0;
		}
		// 如果倒数第一个一个位置元素小于倒数第二个位置的元素，倒数第一个位置的元素局部最小
		if (arr[arr.length - 1] < arr[arr.length - 2]) {
			return arr.length - 1;
		}
		// 以上边界情况都不满足，开始范围内比较，从第二个元素到倒数第二个元素范围查找局部最小
		int left = 1;
		int right = arr.length - 2;
		int mid = 0;
		while (left < right) {
			// 折半
			mid = (left + right) / 2;
			// 降序情况
			if (arr[mid] > arr[mid - 1]) {
				right = mid - 1;
				// 降序情况
			} else if (arr[mid] > arr[mid + 1]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return left;
	}

}
