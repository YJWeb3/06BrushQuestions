package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d27_MergeTwoLists
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:22
 * @Author:NieZheng
 * @Version:1.0
 */
public class d27_MergeTwoLists {

    public class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int x){
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode lastNode = dummy;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                lastNode.next = l1;
                l1 = l1.next;
            }else {
                lastNode.next = l2;
                l2 = l2.next;
            }
            lastNode = lastNode.next;
        }
        if ( l1 != null){
            lastNode.next = l1;
        }else {
            lastNode.next = l2;
        }
        return dummy.next;
    }
}
