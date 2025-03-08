package com.wclass.structalgorithm.list.common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 双端队列实现栈和队列
public class d4_DoubleEndsQueueToStackAndQueue {

	// 双链表节点
	public static class Node<T> {
		public T value;
		public Node<T> last;
		public Node<T> next;

		public Node(T data) {
			value = data;
		}
	}

	// 双端队列
	public static class DoubleEndsQueue<T> {
		public Node<T> head;// 队头
		public Node<T> tail;// 队尾

		// 队头进
		public void addFromHead(T value) {
			Node<T> cur = new Node<T>(value);
			// 第一个元素？
			if (head == null) {
				head = cur;
				tail = cur;
			} else {
				cur.next = head;
				head.last = cur;
				head = cur;
			}
		}

		// 队尾进
		public void addFromBottom(T value) {
			Node<T> cur = new Node<T>(value);
			// 第一个元素？
			if (head == null) {
				head = cur;
				tail = cur;
			} else {
				cur.last = tail;
				tail.next = cur;
				tail = cur;
			}
		}

		// 队头出
		public T popFromHead() {
			if (head == null) {
				return null;
			}
			Node<T> cur = head;
			// 只有一个元素？
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				cur.next = null;
				head.last = null;
			}
			return cur.value;
		}

		// 队尾出
		public T popFromBottom() {
			if (head == null) {
				return null;
			}
			Node<T> cur = tail;
			// 只有一个元素？
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				tail = tail.last;
				tail.next = null;
				cur.last = null;
			}
			return cur.value;
		}

		// 队头是否为空
		public boolean isEmpty() {
			// 队头是否为null
			return head == null;
		}

	}

	// 双端队列实现栈
	public static class MyStack<T> {
		private DoubleEndsQueue<T> queue;

		public MyStack() {
			queue = new DoubleEndsQueue<T>();
		}

		public void push(T value) {
			queue.addFromHead(value);
		}

		public T pop() {
			return queue.popFromHead();
		}

		public boolean isEmpty() {
			return queue.isEmpty();
		}

	}

	// 双端队列实现队列
	public static class MyQueue<T> {
		private DoubleEndsQueue<T> queue;

		public MyQueue() {
			queue = new DoubleEndsQueue<T>();
		}

		public void push(T value) {
			queue.addFromHead(value);
		}

		public T poll() {
			return queue.popFromBottom();
		}

		public boolean isEmpty() {
			return queue.isEmpty();
		}

	}

	// 两个元素是否相等
	public static boolean isEqual(Integer o1, Integer o2) {
		if (o1 == null && o2 != null) {
			return false;
		}
		if (o1 != null && o2 == null) {
			return false;
		}
		if (o1 == null && o2 == null) {
			return true;
		}
		return o1.equals(o2);
	}
}
