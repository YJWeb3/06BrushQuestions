package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d51_delete_node_in_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS2D52
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-22
 * @Version 1.0
 **/
public class StackS2D52 {

    public ListNode deleteNode(ListNode head, int val) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            if (head.val != val) {
                stack.push(head);
            }
            head = head.next;
        }

        while (!stack.isEmpty()) {
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }

}
