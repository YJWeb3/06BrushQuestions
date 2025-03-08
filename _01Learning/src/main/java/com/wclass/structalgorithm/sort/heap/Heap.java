package com.wclass.structalgorithm.sort.heap;

import java.util.Comparator;

/**
 * 实现大根堆
 */
public class Heap {

	public static class MyMaxHeap {
		// 堆
		private int[] heap;
		// 堆大小
		private final int limit;
		// 元素个数
		private int heapSize;

		public MyMaxHeap(int limit) {
			heap = new int[limit];
			this.limit = limit;
			heapSize = 0;
		}

		/**
		 * 堆是否为空
		 * @return
		 */
		public boolean isEmpty() {
			return heapSize == 0;
		}

		/**
		 * 堆否已满
		 * @return
		 */
		public boolean isFull() {
			return heapSize == limit;
		}

		/**
		 * 堆进元素
		 * @param value
		 */
		public void push(int value) {
			if (heapSize == limit) {
				throw new RuntimeException("heap is full");
			}
			heap[heapSize] = value;
			// value  heapSize
			heapInsert(heap, heapSize++);
		}

		// 新加进来的数，现在停在了index位置，请依次往上移动，
		// 移动到0位置，或者干不掉自己的父亲了，停！
		private void heapInsert(int[] arr, int index) {
			// [index]    [index-1]/2
			// index == 0
			while (arr[index] > arr[(index - 1) / 2]) {
				swap(arr, index, (index - 1) / 2);
				index = (index - 1) / 2;
			}
		}

		// 用户此时，让你返回最大值，并且在大根堆中，把最大值删掉
		// 剩下的数，依然保持大根堆组织
		public int pop() {
			int ans = heap[0];
			swap(heap, 0, --heapSize);
			heapify(heap, 0, heapSize);
			return ans;
		}


		// 从index位置，往下看，不断的下沉
		// 停：较大的孩子都不再比index位置的数大；已经没孩子了
		private void heapify(int[] arr, int index, int heapSize) {
			int left = index * 2 + 1;
			while (left < heapSize) { // 如果有左孩子，有没有右孩子，可能有可能没有！
				// 把较大孩子的下标，给largest
				int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
				largest = arr[largest] > arr[index] ? largest : index;
				if (largest == index) {
					break;
				}
				// index和较大孩子，要互换
				swap(arr, largest, index);
				index = largest;
				left = index * 2 + 1;
			}
		}

		private void swap(int[] arr, int i, int j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}

	}

	// 试试用比较器实现大根堆
	public static class MyComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}

	}

}
