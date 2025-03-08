package com.wclass.structalgorithm.list;

// 测试链接：https://leetcode.com/problems/merge-two-sorted-lists
public class d6_MergeTwoSortedLinkedList {

	// 不要提交这个类
	// 单链表结构
	public static class ListNode {
		public int val;
		public ListNode next;
	}

	public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
		// 先判断两个链表头结点是否为null
		if (head1 == null || head2 == null) {
			// 一个链表为null，直接返回另外一个链表
			return head1 == null ? head2 : head1;
		}
		// 上述不符合，小者作为新链表头结点
		ListNode head = head1.val <= head2.val ? head1 : head2;
		// 1号链表当前节点
		ListNode cur1 = head.next;
		// 2号链表当前节点
		ListNode cur2 = head == head1 ? head2 : head1;
		// 新链表上一个节点
		ListNode pre = head;
		// 两者不为null才开始
		while (cur1 != null && cur2 != null) {
			// 1号链表移动还是2号链表移动
			if (cur1.val <= cur2.val) {
				pre.next = cur1;
				cur1 = cur1.next;
			} else {
				pre.next = cur2;
				cur2 = cur2.next;
			}
			pre = pre.next;
		}
		// 最终会以一个链表收尾
		pre.next = cur1 != null ? cur1 : cur2;
		// 返回头节点
		return head;
	}

}
