package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d22_print_list_from_tail_head;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName Solution
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-52
 * @Version 1.0
 **/
public class Solution {

    public int[] reversePrint(ListNode head) {
        int count = 0;  //链表结点的个数
        ListNode p = head;
        while(p != null){  //统计链表中结点的个数
            count++;
            p = p.next;
        }
        int[] ans = new int[count]; //创建一个和结点个数等大的数组
        p = head;
        int index = count - 1; //作为索引填充数组（从后往前填充）
        while(p != null){
            ans[index] = p.val;
            p = p.next;
            index--;
        }
        return ans;
    }


}
