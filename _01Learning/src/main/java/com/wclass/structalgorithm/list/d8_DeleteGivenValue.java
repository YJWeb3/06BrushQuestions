package com.wclass.structalgorithm.list;

//
public class d8_DeleteGivenValue {

	// 单链表结构
	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			this.value = data;
		}
	}

	// head = removeValue(head, 2);
	public static Node removeValue(Node head, int num) {
		// head来到第一个不需要删的位置
		while (head != null) {
			if (head.value != num) {
				break;
			}
			head = head.next;
		}
		// 1 ) head == null
		// 2 ) head != null
		// 保存上一个位置
		Node pre = head;
		// 保存当前位置
		Node cur = head;
		while (cur != null) {
			if (cur.value == num) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}

}
