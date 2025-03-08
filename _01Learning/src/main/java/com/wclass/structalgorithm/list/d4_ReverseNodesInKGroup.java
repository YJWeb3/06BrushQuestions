package com.wclass.structalgorithm.list;

// 测试链接：https://leetcode.com/problems/reverse-nodes-in-k-group/
public class d4_ReverseNodesInKGroup {

	// 不要提交这个类
	// 单链表结构
	public static class ListNode {
		public int val;
		public ListNode next;
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		// 开始位置
		ListNode start = head;
		// 获取最后一个位置
		ListNode end = getKGroupEnd(start, k);
		// 节点总数不是k的整数倍情况
		if (end == null) {
			return head;
		}
		// 第一组凑齐了！
		head = end;
		// 开始反转
		reverse(start, end);
		// 上一组的结尾节点
		ListNode lastEnd = start;

		// 后续不断循环判断
		while (lastEnd.next != null) {
			start = lastEnd.next;
			end = getKGroupEnd(start, k);
			// 节点总数不是k的整数倍情况
			if (end == null) {
				return head;
			}
			reverse(start, end);
			lastEnd.next = end;
			lastEnd = start;
		}
		return head;
	}

	public static ListNode getKGroupEnd(ListNode start, int k) {
		// 走k次
		while (--k != 0 && start != null) {
			start = start.next;
		}
		return start;
	}

	public static void reverse(ListNode start, ListNode end) {
		// 保存下一个位置
		end = end.next;
		// 上一个位置
		ListNode pre = null;
		// 当前位置
		ListNode cur = start;
		// 下一个位置
		ListNode next = null;
		// 当前位置没有跳出这一组时
		while (cur != end) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		// 成功反转
		start.next = end;
	}

}
