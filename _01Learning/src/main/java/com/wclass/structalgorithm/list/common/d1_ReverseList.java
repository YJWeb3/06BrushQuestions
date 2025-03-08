package com.wclass.structalgorithm.list.common;

import java.util.ArrayList;
import java.util.List;

public class d1_ReverseList {

	// 单链表节点
	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			value = data;
		}
	}

	// 双链表节点
	public static class DoubleNode {
		public int value;
		public DoubleNode last;
		public DoubleNode next;

		public DoubleNode(int data) {
			value = data;
		}
	}

	// 反转单链表
	public static Node reverseLinkedList(Node head) {
		Node pre = null;
		Node next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	// 反转双链表
	public static DoubleNode reverseDoubleList(DoubleNode head) {
		DoubleNode pre = null;
		DoubleNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			head.last = next;
			pre = head;
			head = next;
		}
		return pre;
	}

	// 测试反转单链表
	public static Node testReverseLinkedList(Node head) {
		if (head == null) {
			return null;
		}
		ArrayList<Node> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		list.get(0).next = null;
		int N = list.size();
		for (int i = 1; i < N; i++) {
			list.get(i).next = list.get(i - 1);
		}
		return list.get(N - 1);
	}

	// 测试反转双链表
	public static DoubleNode testReverseDoubleList(DoubleNode head) {
		if (head == null) {
			return null;
		}
		ArrayList<DoubleNode> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		list.get(0).next = null;
		DoubleNode pre = list.get(0);
		int N = list.size();
		for (int i = 1; i < N; i++) {
			DoubleNode cur = list.get(i);
			cur.last = null;
			cur.next = pre;
			pre.last = cur;
			pre = cur;
		}
		return list.get(N - 1);
	}

	// 随机生成单链表
	public static Node generateRandomLinkedList(int len, int value) {
		int size = (int) (Math.random() * (len + 1));
		if (size == 0) {
			return null;
		}
		size--;
		Node head = new Node((int) (Math.random() * (value + 1)));
		Node pre = head;
		while (size != 0) {
			Node cur = new Node((int) (Math.random() * (value + 1)));
			pre.next = cur;
			pre = cur;
			size--;
		}
		return head;
	}

	// 生成随机双链表
	public static DoubleNode generateRandomDoubleList(int len, int value) {
		int size = (int) (Math.random() * (len + 1));
		if (size == 0) {
			return null;
		}
		size--;
		DoubleNode head = new DoubleNode((int) (Math.random() * (value + 1)));
		DoubleNode pre = head;
		while (size != 0) {
			DoubleNode cur = new DoubleNode((int) (Math.random() * (value + 1)));
			pre.next = cur;
			cur.last = pre;
			pre = cur;
			size--;
		}
		return head;
	}

	// 获取单链表原始排列
	public static List<Integer> getLinkedListOriginOrder(Node head) {
		List<Integer> ans = new ArrayList<>();
		while (head != null) {
			ans.add(head.value);
			head = head.next;
		}
		return ans;
	}

	// 检测单链表是否反转
	public static boolean checkLinkedListReverse(List<Integer> origin, Node head) {
		for (int i = origin.size() - 1; i >= 0; i--) {
			if (!origin.get(i).equals(head.value)) {
				return false;
			}
			head = head.next;
		}
		return true;
	}

	// 获取双链表原始排列
	public static List<Integer> getDoubleListOriginOrder(DoubleNode head) {
		List<Integer> ans = new ArrayList<>();
		while (head != null) {
			ans.add(head.value);
			head = head.next;
		}
		return ans;
	}

	// 检测双链表是否反转
	public static boolean checkDoubleListReverse(List<Integer> origin, DoubleNode head) {
		DoubleNode end = null;
		// 第一种思路：列表从倒数第一个位置开始拿元素，双向链表从头部拿元素，依次进行比较
		for (int i = origin.size() - 1; i >= 0; i--) {
			if (!origin.get(i).equals(head.value)) {
				return false;
			}
			end = head;
			head = head.next;
		}
		// 第二种思路：列表从第一个位置开始拿元素，双向链表从尾部拿元素，依次进行比较
		for (int i = 0; i < origin.size(); i++) {
			if (!origin.get(i).equals(end.value)) {
				return false;
			}
			end = end.last;
		}
		return true;
	}

	// 构建单链表的虚拟头节点
	public static void dump(Node head) {
		Node dummy = new Node(0);
		dummy.next = head;
	}

}