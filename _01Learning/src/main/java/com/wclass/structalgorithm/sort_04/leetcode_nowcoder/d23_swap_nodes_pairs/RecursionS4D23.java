package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d23_swap_nodes_pairs;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS4D23
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-55
 * @Version 1.0
 **/
public class RecursionS4D23 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }

}
