package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d28_deleteDuplicates
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:30
 * @Author:NieZheng
 * @Version:1.0
 */
public class d28_deleteDuplicates {

    public class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head){
        if (head == null){
            return head;
        }
        ListNode node = head;
        while(node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return head;
    }

}
