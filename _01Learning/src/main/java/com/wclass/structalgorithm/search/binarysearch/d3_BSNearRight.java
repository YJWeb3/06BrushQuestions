package com.wclass.structalgorithm.search.binarysearch;

import com.wclass.structalgorithm.util.TimesUtil;

public class d3_BSNearRight {

	public static int nearestIndex(int[] arr, int value) {
		// 数组为null或者没有元素，没必要查找
		if (arr == null || arr.length == 0) {
			return -1;
		}
		int L = 0;
		int R = arr.length - 1;
		int index = -1; // 记录最右的对号
		while (L <= R) {
			int mid = L + ((R - L) >> 1);
			if (arr[mid] <= value) {
				index = mid;
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return index;
	}
	// for test
	public static void main(String[] args) {
		TimesUtil.test("小于等于某个数最右侧的位置:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(	nearestIndex(orginNums,2) );
			}
		});
	}

}
