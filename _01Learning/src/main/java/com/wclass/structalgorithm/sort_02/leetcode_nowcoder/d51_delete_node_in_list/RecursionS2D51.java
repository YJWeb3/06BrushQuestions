package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d51_delete_node_in_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS2D51
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-21
 * @Version 1.0
 **/
public class RecursionS2D51 {

    public ListNode deleteNode(ListNode head, int val) {

        if(null == head) {
            return head;
        }

        head.next = deleteNode(head.next, val);
        return head.val == val ? head.next : head;

    }

}
