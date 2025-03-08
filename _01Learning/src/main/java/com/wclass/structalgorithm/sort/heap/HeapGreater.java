package com.wclass.structalgorithm.sort.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/*
 * T一定要是非基础类型，有基础类型需求包一层
 * 注意：这里实现的是增强大根堆
 */
public class HeapGreater<T> {

	// 堆
	private ArrayList<T> heap;
	// 键的索引的基础上加入了值的索引,反向索引表
	private HashMap<T, Integer> indexMap;
	// 元素个数
	private int heapSize;
	// 比较器
	private Comparator<? super T> comp;

	public HeapGreater(Comparator<T> c) {
		heap = new ArrayList<>();
		indexMap = new HashMap<>();
		heapSize = 0;
		comp = c;
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
	public int size() {
		return heapSize;
	}

	/**
	 * 堆是否包含这个对象
	 * @param obj
	 * @return
	 */
	public boolean contains(T obj) {
		return indexMap.containsKey(obj);
	}

	/**
	 * 获取堆元素
	 * @return
	 */
	public T peek() {
		return heap.get(0);
	}

	/**
	 * 进堆
	 * @param obj
	 */
	public void push(T obj) {
		heap.add(obj);
		indexMap.put(obj, heapSize);
		heapInsert(heapSize++);
	}

	/**
	 * 出堆
	 * @return
	 */
	public T pop() {
		T ans = heap.get(0);
		swap(0, heapSize - 1);
		indexMap.remove(ans);
		heap.remove(--heapSize);
		heapify(0);
		return ans;
	}

	/**
	 * 移除指定元素
	 * @param obj
	 */
	public void remove(T obj) {
		T replace = heap.get(heapSize - 1);
		int index = indexMap.get(obj);
		indexMap.remove(obj);
		heap.remove(--heapSize);
		if (obj != replace) {
			heap.set(index, replace);
			indexMap.put(replace, index);
			resign(replace);
		}
	}

	/**
	 * 委托
	 * @param obj
	 */
	public void resign(T obj) {
		heapInsert(indexMap.get(obj));
		heapify(indexMap.get(obj));
	}

	/**
	 * 请返回堆上的所有元素
	 */
	public List<T> getAllElements() {
		List<T> ans = new ArrayList<>();
		for (T c : heap) {
			ans.add(c);
		}
		return ans;
	}

	/**
	 * 向堆中插入元素
	 * @param index
	 */
	private void heapInsert(int index) {
		while (comp.compare(heap.get(index), heap.get((index - 1) / 2)) < 0) {
			swap(index, (index - 1) / 2);
			index = (index - 1) / 2;
		}
	}

	/**
	 * 堆化
	 * @param index
	 */
	private void heapify(int index) {
		int left = index * 2 + 1;
		while (left < heapSize) {
			int best = left + 1 < heapSize && comp.compare(heap.get(left + 1), heap.get(left)) < 0 ? (left + 1) : left;
			best = comp.compare(heap.get(best), heap.get(index)) < 0 ? best : index;
			if (best == index) {
				break;
			}
			swap(best, index);
			index = best;
			left = index * 2 + 1;
		}
	}

	/**
	 * 交换元素
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j) {
		T o1 = heap.get(i);
		T o2 = heap.get(j);
		heap.set(i, o2);
		heap.set(j, o1);
		indexMap.put(o2, i);
		indexMap.put(o1, j);
	}

}
