package com.wclass.structalgorithm.sort.heap;

import java.util.PriorityQueue;

public class d1_SortArrayDistanceLessK {

	// 每个元素移动的距离不超过k
	public static void sortedArrDistanceLessK(int[] arr, int k) {
		// 移动距离为0，直接结束
		if (k == 0) {
			return;
		}
		// 默认小根堆
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		// 开始位置
		int index = 0;
		// 0...K-1
		for (; index <= Math.min(arr.length - 1, k - 1); index++) {
			heap.add(arr[index]);
		}
		// 堆进一个元素，出一个元素
		int i = 0;
		for (; index < arr.length; i++, index++) {
			heap.add(arr[index]);
			arr[i] = heap.poll();
		}
		// 堆不为空，一直弹出元素
		while (!heap.isEmpty()) {
			arr[i++] = heap.poll();
		}
	}
}