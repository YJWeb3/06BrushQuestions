package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d9_intersection_two_linked_lists;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerS4D9
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-12
 * @Version 1.0
 **/
public class TwoPointerS4D9 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
