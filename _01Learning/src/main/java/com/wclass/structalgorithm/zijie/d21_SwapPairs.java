package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d21_SwapPairs
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 14:15
 * @Author:NieZheng
 * @Version:1.0
 */
public class d21_SwapPairs {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null && head.next.next != null){
            ListNode n1 = head.next,n2 = head.next.next;
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            head = n1;
        }
        return dummy.next;
    }
}
