package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d51_delete_node_in_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D51
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-18
 * @Version 1.0
 **/
public class TwoPointersS2D51 {

    public ListNode deleteNode(ListNode head, int val) {

        if(head.val == val) {
            return head.next;
        }

        ListNode cur = head;
        ListNode pre = head;

        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }

        if (cur != null) {
            pre.next = cur.next;
        }

        return head;

    }

}
