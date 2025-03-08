package com.wclass.structalgorithm.zijie;

import java.util.HashSet;

/**
 * ClassName:d83_RemoveDublicates
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/13 14:12
 * @Author:NieZheng
 * @Version:1.0
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class d83_RemoveDuplicates {

    public ListNode remoeDuplicates(ListNode head){
        HashSet<Integer> hash = new HashSet<>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null){
            if (hash.contains(head.next.val)){
                head.next = head.next.next;
            }else{
                hash.add(head.next.val);
                head = head.next;
            }
        }
        return dummy.next;
    }
}
