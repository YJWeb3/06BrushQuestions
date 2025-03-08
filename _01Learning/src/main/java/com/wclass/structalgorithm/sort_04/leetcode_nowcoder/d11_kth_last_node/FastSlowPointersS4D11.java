package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d11_kth_last_node;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FastSlowPointersS4D11‌
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-15
 * @Version 1.0
 **/
public class FastSlowPointersS4D11 {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        int n = 0;
        ListNode fast = pHead;
        ListNode slow = pHead;
        //快指针先行k步
        for(int i = 0; i < k; i++){
            if(fast != null)
                fast = fast.next;
                //达不到k步说明链表过短，没有倒数k
            else
                return slow = null;
        }
        //快慢指针同步，快指针先到底，慢指针指向倒数第k个
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
