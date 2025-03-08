package com.wclass.structalgorithm.array.test;

public class d1_PreSum {

	// 一维前缀和：指定范围
	public static class RangeSum1 {
		private int[] arr;
		public RangeSum1(int[] array) {
			arr = array;
		}
		public int rangeSum(int L, int R) {
			int sum = 0;
			for (int i = L; i <= R; i++) {
				sum += arr[i];
			}
			return sum;
		}
	}

	// 一维前缀和
	public static class RangeSum2 {
		// 维护前缀和的一个辅助数组
		private int[] preSum;
		// 整个范围
		public RangeSum2(int[] array) {
			int N = array.length;
			preSum = new int[N];
			preSum[0] = array[0];
			for (int i = 1; i < N; i++) {
				preSum[i] = preSum[i - 1] + array[i];
			}
		}
		// 指定范围
		public int rangeSum(int L, int R) {
			return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
		}
	}


}
