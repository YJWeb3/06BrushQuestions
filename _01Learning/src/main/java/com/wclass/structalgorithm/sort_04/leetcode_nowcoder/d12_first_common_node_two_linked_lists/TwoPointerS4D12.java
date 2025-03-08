package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d12_first_common_node_two_linked_lists;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerS4D12
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-18
 * @Version 1.0
 **/
public class TwoPointerS4D12 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1, l2 = pHead2;
        while(l1 != l2){
            l1 = (l1==null)?pHead2:l1.next;
            l2 = (l2==null)?pHead1:l2.next;
        }
        return l1;
    }


}
