package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d2_reverse_linked_list_specified_interval_within;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName HeadInsertionIterationS4D2
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-00
 * @Version 1.0
 **/
public class HeadInsertionIterationS4D2 {

    public ListNode reverseBetween (ListNode head, int m, int n) {
        //加个表头
        ListNode res = new ListNode(-1);
        res.next = head;
        //前序节点
        ListNode pre = res;
        //当前节点
        ListNode cur = head;
        //找到m
        for(int i = 1; i < m; i++){
            pre = cur;
            cur = cur.next;
        }
        //从m反转到n
        for(int i = m; i < n; i++){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        //返回去掉表头
        return res.next;
    }

}
