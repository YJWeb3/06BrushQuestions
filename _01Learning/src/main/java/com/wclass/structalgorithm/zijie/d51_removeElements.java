package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d51_removeElements
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/9 13:04
 * @Author:NieZheng
 * @Version:1.0
 */
public class d51_removeElements {

    public class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode removeElements(ListNode head,int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while(head.next != null){
            if (head.next.val == val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return dummy.next;
    }

}
