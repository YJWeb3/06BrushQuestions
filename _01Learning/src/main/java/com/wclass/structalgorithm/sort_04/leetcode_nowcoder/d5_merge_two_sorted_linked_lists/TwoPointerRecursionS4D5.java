package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d5_merge_two_sorted_linked_lists;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointerRecursionS4D5
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-06
 * @Version 1.0
 **/
public class TwoPointerRecursionS4D5 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        //一个已经为空了，返回另一个
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        //先用较小的值的节点
        if(list1.val <= list2.val){
            //递归往下
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            //递归往下
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

}
