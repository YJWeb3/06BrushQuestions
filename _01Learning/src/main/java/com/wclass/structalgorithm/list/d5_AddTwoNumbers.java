package com.wclass.structalgorithm.list;

// 测试链接：https://leetcode.com/problems/add-two-numbers/
public class d5_AddTwoNumbers {

	// 不要提交这个类
	// 单链表结构
	public static class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/**
	 * 两个非空链表作为参数传递
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
		// 获取两个链表对应的长度
		int len1 = listLength(head1);
		int len2 = listLength(head2);
		// 谁大，进位给谁
		ListNode l = len1 >= len2 ? head1 : head2;
		ListNode s = l == head1 ? head2 : head1;
		ListNode curL = l;
		ListNode curS = s;
		// 最后一个位置
		ListNode last = curL;
		// 进位数
		int carry = 0;
		// 当前数
		int curNum = 0;
		// 小者开始
		while (curS != null) {
			curNum = curL.val + curS.val + carry;
			curL.val = (curNum % 10);
			carry = curNum / 10;
			last = curL;
			curL = curL.next;
			curS = curS.next;
		}
		// 大者未结束
		while (curL != null) {
			curNum = curL.val + carry;
			curL.val = (curNum % 10);
			carry = curNum / 10;
			last = curL;
			curL = curL.next;
		}
		// 进位还不为0，还需要构建一个节点存储
		if (carry != 0) {
			last.next = new ListNode(1);
		}
		// 返回长度最大的链表
		return l;
	}

	// 求链表长度
	public static int listLength(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}

}
