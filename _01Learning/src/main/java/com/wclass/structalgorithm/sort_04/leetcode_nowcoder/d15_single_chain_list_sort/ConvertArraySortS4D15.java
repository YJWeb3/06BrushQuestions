package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d15_single_chain_list_sort;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program: StructAlgorithm
 * @ClassName ConvertArraySortingS4D15
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-14
 * @Version 1.0
 **/
public class ConvertArraySortS4D15 {

    public ListNode sortInList (ListNode head) {
        ArrayList<Integer> nums = new ArrayList();
        ListNode p = head;
        //遍历链表，将节点值加入数组
        while(p != null){
            nums.add(p.val);
            p = p.next;
        }
        p = head;
        //对数组元素排序
        Collections.sort(nums);
        //遍历数组
        for(int i = 0; i < nums.size(); i++){
            //将数组元素依次加入链表
            p.val = nums.get(i);
            p = p.next;
        }
        return head;
    }

}
