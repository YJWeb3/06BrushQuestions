package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d5_merge_two_sorted_linked_lists;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName DoublePointerIterationS4D5
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-06
 * @Version 1.0
 **/
public class DoublePointerIterationS4D5 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        //一个已经为空了，直接返回另一个
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        //加一个表头
        ListNode head = new ListNode(0);
        ListNode cur = head;
        //两个链表都要不为空
        while(list1 != null && list2 != null){
            //取较小值的节点
            if(list1.val <= list2.val){
                cur.next = list1;
                //只移动取值的指针
                list1 = list1.next;
            }else{
                cur.next = list2;
                //只移动取值的指针
                list2 = list2.next;
            }
            //指针后移
            cur = cur.next;
        }
        //哪个链表还有剩，直接连在后面
        if(list1 != null)
            cur.next = list1;
        else
            cur.next = list2;
        //返回值去掉表头
        return head.next;
    }

}
