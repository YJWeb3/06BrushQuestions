package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d7_determine_linked_list_has_cycle;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerS4D7
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-09
 * @Version 1.0
 **/
public class TwoPointerS4D7 {

    public boolean hasCycle(ListNode head) {
        //先判断链表为空的情况
        if(head == null)
            return false;
        //快慢双指针
        ListNode fast = head;
        ListNode slow = head;
        //如果没环快指针会先到链表尾
        while(fast != null && fast.next != null){
            //快指针移动两步
            fast = fast.next.next;
            //慢指针移动一步
            slow = slow.next;
            //相遇则有环
            if(fast == slow)
                return true;
        }
        //到末尾则没有环
        return false;
    }

}
