package com.wclass.structalgorithm.list.common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class d2_LinkedListToQueueAndStack {

	// 单链表节点
	public static class Node<V> {
		public V value;
		public Node<V> next;

		public Node(V v) {
			value = v;
			next = null;
		}
	}

	// 单链表实现队列
	public static class MyQueue<V> {
		private Node<V> head;// 队头
		private Node<V> tail;// 队尾
		private int size;// 队列当前元素个数

		public MyQueue() {
			head = null;
			tail = null;
			size = 0;
		}

		/**
		 * 队列位元素是否位空
		 * @return
		 */
		public boolean isEmpty() {
			return size == 0;
		}

		/**
		 * 队列元素个数
		 * @return
		 */
		public int size() {
			return size;
		}

		/**
		 * 添加元素
		 * @param value
		 */
		public void offer(V value) {
			// 新增节点
			Node<V> cur = new Node<V>(value);
			// 第一个节点？
			if (tail == null) {
				head = cur;
				tail = cur;
			} else {
				tail.next = cur;
				tail = cur;
			}
			size++;
		}

		/**
		 * 删除队头元素并返回
		 * @return
		 */
		public V poll() {
			V ans = null;
			// 队头为null？
			if (head != null) {
				ans = head.value;
				head = head.next;
				size--;
			}
			// 删除后，没有元素了
			if (head == null) {
				tail = null;
			}
			return ans;
		}

		/**
		 * 返回队头元素，但不删除
		 * @return
		 */
		public V peek() {
			V ans = null;
			if (head != null) {
				ans = head.value;
			}
			return ans;
		}

	}

	// 单链表实现栈
	public static class MyStack<V> {
		private Node<V> head;// 栈顶
		private int size;// 栈当前元素个数

		public MyStack() {
			head = null;
			size = 0;
		}

		/**
		 * 栈是否为空
		 * @return
		 */
		public boolean isEmpty() {
			return size == 0;
		}

		/**
		 * 栈当前元素个数
		 * @return
		 */
		public int size() {
			return size;
		}

		/**
		 * 进栈
		 * @param value
		 */
		public void push(V value) {
			Node<V> cur = new Node<>(value);
			// 第一个元素？
			if (head == null) {
				head = cur;
			} else {
				cur.next = head;
				head = cur;
			}
			size++;
		}

		/**
		 * 出栈
		 * @return
		 */
		public V pop() {
			V ans = null;
			// 栈顶不为null
			if (head != null) {
				ans = head.value;
				head = head.next;
				size--;
			}
			return ans;
		}

		/**
		 * 返回栈顶元素个数
		 * @return
		 */
		public V peek() {
			return head != null ? head.value : null;
		}
	}
}
