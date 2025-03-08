package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d51_delete_node_in_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName DummyNodeS2D51
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-20
 * @Version 1.0
 **/
public class DummyNodeS2D51 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            } else {
                cur = cur.next;
            }

        }
        return dummyHead.next;
    }

}
