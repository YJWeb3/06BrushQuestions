package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d30_MiddleNode
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:47
 * @Author:NieZheng
 * @Version:1.0
 */
public class d30_MiddleNode {

    public class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode middleNode(ListNode head){

        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head,fast = head.next;
        if (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
