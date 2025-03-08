package com.wclass.structalgorithm.sort.merge;

public class d2_BiggerThanRightTwice {

	public static int biggerTwice(int[] arr) {
		// 数组为null或者元素只有一个说明没有逆序对
		if (arr == null || arr.length < 2) {
			return 0;
		}
		// 不满足以上条件进一步处理
		return process(arr, 0, arr.length - 1);
	}

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

	public static int merge(int[] arr, int L, int m, int r) {
		// [L....M]   [M+1....R]
		
		int ans = 0;
		// 目前囊括进来的数，是从[M+1, windowR)
		int windowR = m + 1;
		for (int i = L; i <= m; i++) {
			while (windowR <= r && arr[i] > (arr[windowR] * 2)) {
				windowR++;
			}
			// 结果
			ans += windowR - m - 1;
		}

		// 构造一个能存放该区域元素的辅助数组
		int[] help = new int[r - L + 1];
		// 第一个位置开始
		int i = 0;
		// 左区域第一个位置
		int p1 = L;
		// 右区域第一个位置
		int p2 = m + 1;
		while (p1 <= m && p2 <= r) {
			// 左右区域的元素依次比较后再进行赋值,然后移动位置
			help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
		}
		// 要么p1越界了，要么p2越界了
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		// 迭代辅助数组赋值到原数组
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[L + i] = help[i];
		}
		return ans;
	}

}
