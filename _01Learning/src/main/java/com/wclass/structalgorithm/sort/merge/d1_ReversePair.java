package com.wclass.structalgorithm.sort.merge;

public class d1_ReversePair {

	public static int reverPairNumber(int[] arr) {
		// 数组为null或者元素只有一个说明没有逆序对
		if (arr == null || arr.length < 2) {
			return 0;
		}
		// 不满足以上条件进一步处理
		return process(arr, 0, arr.length - 1);
	}

	// arr[L..R]既要排好序，也要求逆序对数量返回
	// 所有merge时，产生的逆序对数量，累加，返回
	// 左 排序 merge并产生逆序对数量
	// 右 排序 merge并产生逆序对数量
	public static int process(int[] arr, int l, int r) {
		// 左边界等于右边界，已经到最后一个元素
		if (l == r) {
			return 0;
		}
		// 找到中间位置
		int mid = l + ((r - l) >> 1);
		// 所有merge时，产生的逆序对数量，累加，返回
		return process(arr, l, mid) + process(arr, mid + 1, r) + merge(arr, l, mid, r);
	}

	public static int merge(int[] arr, int L, int m, int R) {
		// 构造一个能存放该区域元素的辅助数组
		int[] help = new int[R - L + 1];
		// 最远位置
		int i = help.length - 1;
		// 左区域最后一个位置
		int p1 = m;
		// 右区域最后一个位置
		int p2 = R;
		// 保存结果
		int res = 0;
		while (p1 >= L && p2 > m) {
			res += arr[p1] > arr[p2] ? (p2 - m) : 0;
			help[i--] = arr[p1] > arr[p2] ? arr[p1--] : arr[p2--];
		}
		while (p1 >= L) {
			help[i--] = arr[p1--];
		}
		while (p2 > m) {
			help[i--] = arr[p2--];
		}
		// 迭代辅助数组赋值到原数组
		for (i = 0; i < help.length; i++) {
			arr[L + i] = help[i];
		}
		// 返回结果
		return res;
	}
}
