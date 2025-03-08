package com.wclass.structalgorithm.queue;

public class d1_RingArray {

	public static class MyQueue {
		// 底层基于数组
		private int[] arr;
		// 进队
		private int pushi;// end
		// 出队
		private int polli;// begin
		// 元素数量
		private int size;
		// 元素数量限制
		private final int limit;

		/**
		 * 传参限制大小
		 * @param limit
		 */
		public MyQueue(int limit) {
			arr = new int[limit];
			pushi = 0;
			polli = 0;
			size = 0;
			this.limit = limit;
		}

		// 进队
		public void push(int value) {
			if (size == limit) {
				throw new RuntimeException("队列满了，不能再加了");
			}
			size++;
			arr[pushi] = value;
			// 下一个位置
			pushi = nextIndex(pushi);
		}

		public int pop() {
			if (size == 0) {
				throw new RuntimeException("队列空了，不能再拿了");
			}
			size--;
			int ans = arr[polli];
			// 下一个位置
			polli = nextIndex(polli);
			return ans;
		}

		// 队列是否为空
		public boolean isEmpty() {
			return size == 0;
		}

		// 如果现在的下标是i，返回下一个位置
		private int nextIndex(int i) {
			return i < limit - 1 ? i + 1 : 0;// 不能超出范围，超出范围，走到第一个位置
		}

	}

}
