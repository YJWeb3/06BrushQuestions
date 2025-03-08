package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d23_swap_nodes_pairs;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName IterationS4D23
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-56
 * @Version 1.0
 **/
public class IterationS4D23 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }

}
