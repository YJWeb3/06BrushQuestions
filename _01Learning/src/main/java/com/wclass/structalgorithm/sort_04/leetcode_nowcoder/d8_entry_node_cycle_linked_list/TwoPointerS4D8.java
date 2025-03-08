package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d8_entry_node_cycle_linked_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerS4D8
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-10
 * @Version 1.0
 **/
public class TwoPointerS4D8 {

    //判断有没有环，返回相遇的地方
    public ListNode hasCycle(ListNode head) {
        //先判断链表为空的情况
        if(head == null)
            return null;
        //快慢双指针
        ListNode fast = head;
        ListNode slow = head;
        //如果没环快指针会先到链表尾
        while(fast != null && fast.next != null){
            //快指针移动两步
            fast = fast.next.next;
            //慢指针移动一步
            slow = slow.next;
            //相遇则有环，返回相遇的位置
            if(fast == slow)
                return slow;
        }
        //到末尾说明没有环，返回null
        return null;
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode slow = hasCycle(pHead);
        //没有环
        if(slow == null)
            return null;
        //快指针回到表头
        ListNode fast = pHead;
        //再次相遇即是环入口
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
