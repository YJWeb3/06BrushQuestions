package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d62_InsertNode
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 14:05
 * @Author:NieZheng
 * @Version:1.0
 */
public class d62_InsertNode {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode insertNode(ListNode head,int val){
        ListNode node = new ListNode(val);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while(head.next != null && head.next.val <= val){
            head = head.next;
        }
        node.next = head.next;
        head.next = node;

        return dummy.next;
    }

}
