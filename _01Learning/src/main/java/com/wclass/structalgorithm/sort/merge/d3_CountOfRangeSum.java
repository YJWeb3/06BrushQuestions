package com.wclass.structalgorithm.sort.merge;

// 这道题直接在leetcode测评：
// https://leetcode.com/problems/count-of-range-sum/
public class d3_CountOfRangeSum {

	public static int countRangeSum(int[] nums, int lower, int upper) {
		// 数组为null或者元素只有一个说明没有什么区间和
		if (nums == null || nums.length == 0) {
			return 0;
		}
		// 构建一个辅助数组作为前缀和数组
		long[] sum = new long[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i - 1] + nums[i];
		}
		// 进一步处理
		return process(sum, 0, sum.length - 1, lower, upper);
	}

	public static int process(long[] sum, int L, int R, int lower, int upper) {
		// 左边界等于右边界，已经到最后一个元素
		if (L == R) {
			// 满足如下条件，个数+1
			return sum[L] >= lower && sum[L] <= upper ? 1 : 0;
		}
		// 求中间区域
		int M = L + ((R - L) >> 1);
		// 递归处理
		return process(sum, L, M, lower, upper) + process(sum, M + 1, R, lower, upper)
				+ merge(sum, L, M, R, lower, upper);
	}

	public static int merge(long[] arr, int L, int M, int R, int lower, int upper) {
		// 记录答案
		int ans = 0;
		// 左边界
		int windowL = L;
		// 右边界
		int windowR = L;
		// [windowL, windowR)
		for (int i = M + 1; i <= R; i++) {
			// 得到最小值
			long min = arr[i] - upper;
			// 得到最大值
			long max = arr[i] - lower;
			// 定位右边界
			while (windowR <= M && arr[windowR] <= max) {
				windowR++;
			}
			// 定位左边界
			while (windowL <= M && arr[windowL] < min) {
				windowL++;
			}
			// 结果
			ans += windowR - windowL;
		}
		// 构造一个能存放该区域元素的辅助数组
		long[] help = new long[R - L + 1];
		// 第一个位置开始
		int i = 0;
		// 左区域第一个位置
		int p1 = L;
		// 右区域第一个位置
		int p2 = M + 1;
		while (p1 <= M && p2 <= R) {
			// 左右区域的元素依次比较后再进行赋值,然后移动位置
			help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
		}
		// 要么p1越界了，要么p2越界了
		while (p1 <= M) {
			help[i++] = arr[p1++];
		}
		while (p2 <= R) {
			help[i++] = arr[p2++];
		}
		// 迭代辅助数组赋值到原数组
		for (i = 0; i < help.length; i++) {
			arr[L + i] = help[i];
		}
		return ans;
	}

}
