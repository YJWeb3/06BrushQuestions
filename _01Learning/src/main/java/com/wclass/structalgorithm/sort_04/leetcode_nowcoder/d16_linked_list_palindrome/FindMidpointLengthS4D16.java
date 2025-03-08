package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d16_linked_list_palindrome;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FindMidpointLengthS4D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-23
 * @Version 1.0
 **/
public class FindMidpointLengthS4D16 {

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
        ListNode p = head;
        int n = 0;
        //找到链表长度
        while(p != null){
            n++;
            p = p.next;
        }
        //中点
        n = n / 2;
        p = head;
        //遍历到中点位置
        while(n > 0){
            p = p.next;
            n--;
        }
        //中点处反转
        p = reverse(p);
        ListNode q = head;
        while(p != null){
            //比较判断节点值是否相等
            if(p.val != q.val)
                return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

}
