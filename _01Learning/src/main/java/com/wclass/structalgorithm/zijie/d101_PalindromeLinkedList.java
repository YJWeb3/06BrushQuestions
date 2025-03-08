package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d101_PalindromeLinkedList
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/22 13:20
 * @Author:NieZheng
 * @Version:1.0
 */
public class d101_PalindromeLinkedList {

    public boolean isPalindrome(ListNode head){
        if (head == null){
            return true;
        }
        
        ListNode middle = findMiddle(head);
        middle.next = reverse(middle.next);
        
        ListNode p1 = head,p2 = middle.next;
        while(p1 != null && p2 != null && p1.val == p2.val){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2 == null;
    }

    private ListNode findMiddle(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode slow = head,fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
