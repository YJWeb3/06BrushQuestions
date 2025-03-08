package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d1_reverse_linked_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.Stack;

/**
 * @program: StructAlgorithm
 * @ClassName StackS4D1
 * @description:
 * @author: W哥
 * @create: 2024-09-29-21-57
 * @Version 1.0
 **/
public class StackS4D1 {

    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack= new Stack<>();
        //把链表节点全部摘掉放到栈中
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode dummy = node;
        //栈中的结点全部出栈，然后重新连成一个新的链表
        while (!stack.isEmpty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next = null;
        return dummy;
    }

}
