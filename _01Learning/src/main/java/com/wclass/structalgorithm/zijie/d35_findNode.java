package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d35_findNode
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 15:22
 * @Author:NieZheng
 * @Version:1.0
 */
public class d35_findNode {


    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public ListNode findNode(ListNode head,int val){
        if (head == null){
            return head;
        }
        while(head != null){
            if (head.val == val){
                return head;
            }
            head = head.next;
        }
        return null;
    }

}
