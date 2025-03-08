package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d21_remove_nth_node_end_list;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName LengthStatisticalS4D21
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-50
 * @Version 1.0
 **/
public class LengthStatisticalS4D21 {

    public ListNode removeNthFromEnd (ListNode head, int n) {
        //记录链表长度
        int length = 0;
        //添加表头
        ListNode res = new ListNode(-1);
        res.next = head;
        //当前节点
        ListNode cur = head;
        //前序节点
        ListNode pre = res;
        //找到链表长度
        while(cur != null){
            length++;
            cur = cur.next;
        }
        //回到头部
        cur = head;
        //从头遍历找到倒数第n个位置
        for(int i = 0; i < length - n; i++){
            pre = cur;
            cur = cur.next;
        }
        //删去倒数第n个节点
        pre.next = cur.next;
        //返回去掉头节点
        return res.next;
    }

}
