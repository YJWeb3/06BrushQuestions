package com.wclass.structalgorithm.sort.quick;

import com.wclass.structalgorithm.util.TimesUtil;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort4 {

	// 快排非递归版本需要的辅助类
	// 要处理的是什么范围上的排序
	public static class Op {
		public int l;
		public int r;

		public Op(int left, int right) {
			l = left;
			r = right;
		}
	}

	// 快排3.0 非递归版本
	public static void quickSort(int[] arr) {
		// 数组为null或者元素只有一个没必要排序
		if (arr == null || arr.length < 2) {
			return;
		}
		// 获取数组长度
		int R = arr.length;
		// 随机选取1个位置上的数换到R位置上,就是随机一个划分值
		swap(arr, (int) (Math.random() * R), R - 1);
		// 等于区，荷兰国旗问题后，返回的数组
		int[] equalArea = netherlandsFlag(arr, 0, R - 1);
		// 获取等于区的左边数
		int el = equalArea[0];
		// 获取等于区的右边数
		int er = equalArea[1];
		Stack<Op> stack = new Stack<>();
		stack.push(new Op(0, el - 1));
		stack.push(new Op(er + 1, R - 1));
		while (!stack.isEmpty()) {
			Op op = stack.pop(); // op.l  ... op.r
			if (op.l < op.r) {
				swap(arr, op.l + (int) (Math.random() * (op.r - op.l + 1)), op.r);
				equalArea = netherlandsFlag(arr, op.l, op.r);
				el = equalArea[0];
				er = equalArea[1];
				stack.push(new Op(op.l, el - 1));
				stack.push(new Op(er + 1, op.r));
			}
		}
	}

	// arr[L...R] 玩荷兰国旗问题的划分，以arr[R]做划分值
	// <arr[R] ==arr[R] > arr[R]
	public static int[] netherlandsFlag(int[] arr, int L, int R) {
		// 左边界大于右边界，没必要划分了
		if (L > R) { // L...R L>R
			return new int[] { -1, -1 };
		}
		// 左边界等于右边界，返回左右边界位置
		if (L == R) {
			return new int[] { L, R };
		}
		// 以上不满足，开始荷兰国旗问题
		int less = L - 1; // < 区 右边界
		int more = R; // > 区 左边界
		int index = L;
		while (index < more) { // 当前位置，不能和 >区的左边界撞上
			if (arr[index] == arr[R]) {
				index++;
			} else if (arr[index] < arr[R]) {
				// 小于区右移一步再与当前位置交换，当前位置往后走一步
				swap(arr, index++, ++less);
			} else { // >
				// 都不满足，就是大于，右边区往左走一步再与当前位置交换
				swap(arr, index, --more);
			}
		}
		// 最终还有一个划分值需要移动到中间位置，即右边区与划分值交换位置
		swap(arr, more, R); // <[R]   =[R]   >[R]
		// 完成划分，返回一个只有两个元素的数组
		return new int[] { less + 1, more };
	}

	// 两两交换算法
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// for test
	public static void main(String[] args) {
		TimesUtil.test("优化：基于荷兰国旗问题的非递归版本随机快速排序:", new TimesUtil.Task() {
			@Override
			public void execute() {
				int[] orginNums = {1,2,6,8,2,4};
				System.out.println(Arrays.toString(orginNums));
				quickSort(orginNums);
				System.out.println(Arrays.toString(orginNums));
			}
		});
	}

}
