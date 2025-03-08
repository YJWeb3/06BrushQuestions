package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d10_linked_list_cycle_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FastSlowPointerS4D10
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-14
 * @Version 1.0
 **/
public class FastSlowPointerS4D10 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

}
