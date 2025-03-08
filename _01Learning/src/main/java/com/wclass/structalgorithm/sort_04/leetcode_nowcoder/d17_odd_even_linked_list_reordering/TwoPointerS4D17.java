package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d17_odd_even_linked_list_reordering;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerS4D17
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-29
 * @Version 1.0
 **/
public class TwoPointerS4D17 {

    public ListNode oddEvenList (ListNode head) {
        //如果链表为空，不用重排
        if(head == null)
            return head;
        //even开头指向第二个节点，可能为空
        ListNode even = head.next;
        //odd开头指向第一个节点
        ListNode odd = head;
        //指向even开头
        ListNode evenhead = even;
        while(even != null && even.next != null){
            //odd连接even的后一个，即奇数位
            odd.next = even.next;
            //odd进入后一个奇数位
            odd = odd.next;
            //even连接后一个奇数的后一位，即偶数位
            even.next = odd.next;
            //even进入后一个偶数位
            even = even.next;
        }
        //even整体接在odd后面
        odd.next = evenhead;
        return head;
    }

}
