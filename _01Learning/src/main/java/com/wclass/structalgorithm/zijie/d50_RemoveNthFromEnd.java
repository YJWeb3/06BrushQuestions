package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d50_RemoveNthFromEnd
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 12:47
 * @Author:NieZheng
 * @Version:1.0
 */
public class d50_RemoveNthFromEnd {

    public class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head,int n){
        if (n <= 0){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode preDelete = dummy;
        for (int i = 0; i < n ; i++) {
            if (head == null){
                return null;
            }
            head = head.next;
        }
        while(head != null){
            head = head.next;
            preDelete = preDelete.next;
        }

        preDelete.next = preDelete.next.next;

        return dummy.next;
    }

}
