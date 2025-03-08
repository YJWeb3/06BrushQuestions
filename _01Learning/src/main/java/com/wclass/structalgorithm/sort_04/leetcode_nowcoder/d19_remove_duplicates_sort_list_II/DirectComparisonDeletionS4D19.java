package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d19_remove_duplicates_sort_list_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName DirectComparisonDeletionS4D19
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-44
 * @Version 1.0
 **/
public class DirectComparisonDeletionS4D19 {

    public ListNode deleteDuplicates (ListNode head) {
        //空链表
        if(head == null)
            return null;
        ListNode res = new ListNode(0);
        //在链表前加一个表头
        res.next = head;
        ListNode cur = res;
        while(cur.next != null && cur.next.next != null){
            //遇到相邻两个节点值相同
            if(cur.next.val == cur.next.next.val){
                int temp = cur.next.val;
                //将所有相同的都跳过
                while (cur.next != null && cur.next.val == temp)
                    cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        //返回时去掉表头
        return res.next;
    }

}
