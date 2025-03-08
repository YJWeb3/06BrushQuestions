package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d1_reverse_linked_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName IterationS4D1
 * @description:
 * @author: W哥
 * @create: 2024-09-29-21-56
 * @Version 1.0
 **/
public class IterationS4D1 {

    public ListNode ReverseList(ListNode head) {
        //处理空链表
        if(head == null)
            return null;
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            //断开链表，要记录后续一个
            ListNode temp = cur.next;
            //当前的next指向前一个
            cur.next = pre;
            //前一个更新为当前
            pre = cur;
            //当前更新为刚刚记录的后一个
            cur = temp;
        }
        return pre;
    }

}
