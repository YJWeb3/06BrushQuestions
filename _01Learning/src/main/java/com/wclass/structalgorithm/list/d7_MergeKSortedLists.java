package com.wclass.structalgorithm.list;

import java.util.Comparator;
import java.util.PriorityQueue;

// 测试链接：https://leetcode.com/problems/merge-k-sorted-lists/
public class d7_MergeKSortedLists {

	// 单链表结构
	public static class ListNode {
		public int val;
		public ListNode next;
	}

	// 实现Comparator比较器
	public static class ListNodeComparator implements Comparator<ListNode> {

		@Override
		public int compare(ListNode o1, ListNode o2) {
			// 升序
			return o1.val - o2.val; 
		}

	}

	/**
	 *合并k个有序链表
	 * @param lists
	 * @return
	 */
	public static ListNode mergeKLists(ListNode[] lists) {
		// 链表为null，没必要比较
		if (lists == null) {
			return null;
		}
		// 优先级队列实现
		PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());
		// 添加链表到优先级队列
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				heap.add(lists[i]);
			}
		}
		// 堆有元素？
		if (heap.isEmpty()) {
			return null;
		}
		// 出一个元素
		ListNode head = heap.poll();
		// 保存上一个位置
		ListNode pre = head;
		if (pre.next != null) {
			heap.add(pre.next);
		}
		while (!heap.isEmpty()) {
			ListNode cur = heap.poll();
			pre.next = cur;
			pre = cur;
			if (cur.next != null) {
				heap.add(cur.next);
			}
		}
		return head;
	}

}
