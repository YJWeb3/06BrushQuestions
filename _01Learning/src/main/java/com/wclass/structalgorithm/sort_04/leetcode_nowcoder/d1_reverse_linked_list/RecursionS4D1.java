package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d1_reverse_linked_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS4D1
 * @description:
 * @author: W哥
 * @create: 2024-09-29-21-57
 * @Version 1.0
 **/
public class RecursionS4D1 {

    public ListNode ReverseList(ListNode head) {
        //递归结束条件
        if(head == null || head.next == null)
            return head;
        //反转下一个
        ListNode newHead = ReverseList(head.next);
        //逆转本级节点
        head.next.next = head;
        //尾部设置空节点
        head.next = null;
        return newHead;
    }

}
