package com.wclass.structalgorithm.search.binarysearch;

import com.wclass.structalgorithm.util.TimesUtil;

public class d1_BSExist {

	public static boolean binarySearch(int[] arr, int num) {
		// 数组为null或者没有元素，没必要查找
		if (arr == null || arr.length == 0) {
			return false;
		}
		int L = 0;
		int R = arr.length - 1;
		int mid = 0;
		// 范围查找
		while (L < R) {
			// 折半
			mid = L + ((R - L) >> 1); // mid = (L + R) / 2
			if (arr[mid] == num) {
				return true;
			} else if (arr[mid] > num) {
				R = mid - 1;
			} else {
				L = mid + 1;
			}
		}
		// 范围内未找到
		return arr[L] == num;
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("二分查找:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(	binarySearch(orginNums,2) );
			}
		});
	}
}
