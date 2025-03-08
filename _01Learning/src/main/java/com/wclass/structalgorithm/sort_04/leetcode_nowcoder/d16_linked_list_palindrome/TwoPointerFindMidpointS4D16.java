package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d16_linked_list_palindrome;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerFindMidpointS4D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-25
 * @Version 1.0
 **/
public class TwoPointerFindMidpointS4D16 {

    //反转链表指针
    ListNode reverse(ListNode head) {
        //前序节点
        ListNode prev = null;
        while(head != null){
            //断开后序
            ListNode next = head.next;
            //指向前序
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public boolean isPail (ListNode head) {
        //空链表直接为回文
        if(head == null)
            return true;
        //准备快慢双指针
        ListNode slow = head;
        ListNode fast = head;
        //双指针找中点
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //中点处反转
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            //比较判断节点值是否相等
            if(slow.val != fast.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

}
