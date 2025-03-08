package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d51_delete_node_in_list;


import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName SinglePointerS2D51
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-16
 * @Version 1.0
 **/
public class SinglePointerS2D51 {

    public ListNode deleteNode(ListNode head, int val) {

        if(head.val == val) {
            return head.next;
        }

        ListNode pre = head;

        while ((pre.next != null) && (pre.next.val != val)){
            pre = pre.next;
        }

        if(pre.next != null) {
            pre.next = pre.next.next;
        }

        return head;

    }
}
