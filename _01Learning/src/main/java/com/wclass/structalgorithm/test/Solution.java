package com.wclass.structalgorithm.test;


import java.util.*;
public class Solution {

    public static class ListNode{
        ListNode next;
        String val;

        public ListNode(String val){
            this.val = val;
        }

    }

    public ListNode deletValue(ListNode head){

        ListNode p = new ListNode("");
        p.next = head;
        ListNode cur = p;

        while ( cur.next != null ){
            if (cur.next.val == "x"){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return p.next;
    }

}