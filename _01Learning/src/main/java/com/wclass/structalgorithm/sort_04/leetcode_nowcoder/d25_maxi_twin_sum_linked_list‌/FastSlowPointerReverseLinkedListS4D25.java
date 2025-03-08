package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d25_maxi_twin_sum_linked_list‌;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FastSlowPointerReverseLinkedListS4D25
 * @description:
 * @author: W哥
 * @create: 2024-10-01-10-04
 * @Version 1.0
 **/
public class FastSlowPointerReverseLinkedListS4D25 {

    public int pairSum(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = reverse(slow);
        ListNode head1 = head, head2 = prev;
        int res = 0;

        while (head2 != null) {
            res = Math.max(head1.val + head2.val, res);
            head1 = head1.next;
            head2 = head2.next;
        }
        return res;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int pairSum02(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        int res = 0;
        while (slow != null) {
            res = Math.max(res, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }
        return res;
    }
}
