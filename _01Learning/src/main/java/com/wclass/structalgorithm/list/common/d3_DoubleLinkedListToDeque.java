package com.wclass.structalgorithm.list.common;

import java.util.Deque;
import java.util.LinkedList;

public class d3_DoubleLinkedListToDeque {

	// 双链表节点
	public static class Node<V> {
		public V value;
		public Node<V> last;
		public Node<V> next;

		public Node(V v) {
			value = v;
			last = null;
			next = null;
		}
	}

	// 双链表实现双端队列
	public static class MyDeque<V> {
		private Node<V> head;// 队头
		private Node<V> tail;// 队尾
		private int size;// 双端队列当前元素个数

		public MyDeque() {
			head = null;
			tail = null;
			size = 0;
		}

		/**
		 * 双端队列是否为空
		 * @return
		 */
		public boolean isEmpty() {
			return size == 0;
		}

		/**
		 * 双端队列元素个数
		 * @return
		 */
		public int size() {
			return size;
		}

		/**
		 * 队头进
		 * @param value
		 */
		public void pushHead(V value) {
			Node<V> cur = new Node<>(value);
			// 第一个元素？
			if (head == null) {
				head = cur;
				tail = cur;
			} else {
				cur.next = head;
				head.last = cur;
				head = cur;
			}
			size++;
		}

		/**
		 * 队尾进
		 * @param value
		 */
		public void pushTail(V value) {
			Node<V> cur = new Node<>(value);
			// 第一个元素？
			if (head == null) {
				head = cur;
				tail = cur;
			} else {
				tail.next = cur;
				cur.last = tail;
				tail = cur;
			}
			size++;
		}

		/**
		 * 队头出，返回删除元素
		 * @return
		 */
		public V pollHead() {
			V ans = null;
			// 没有元素，直接返回null
			if (head == null) {
				return ans;
			}
			size--;
			ans = head.value;
			// 只有一个元素？
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.last = null;
			}
			return ans;
		}

		/**
		 * 队尾出，返回删除元素
		 * @return
		 */
		public V pollTail() {
			V ans = null;
			// 没有元素，直接返回null
			if (head == null) {
				return ans;
			}
			size--;
			ans = tail.value;
			// 只有一个元素？
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				tail = tail.last;
				tail.next = null;
			}
			return ans;
		}

		/**
		 * 返回队头元素，但不删除
		 * @return
		 */
		public V peekHead() {
			V ans = null;
			if (head != null) {
				ans = head.value;
			}
			return ans;
		}

		/**
		 * 返回队尾元素，但不删除
		 * @return
		 */
		public V peekTail() {
			V ans = null;
			if (tail != null) {
				ans = tail.value;
			}
			return ans;
		}

	}

}
