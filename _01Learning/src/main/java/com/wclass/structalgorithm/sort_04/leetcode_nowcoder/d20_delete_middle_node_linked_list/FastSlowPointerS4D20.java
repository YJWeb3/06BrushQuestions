package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d20_delete_middle_node_linked_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FastSlowPointerS4D20
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-47
 * @Version 1.0
 **/
public class FastSlowPointerS4D20 {

    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;

    }

}
