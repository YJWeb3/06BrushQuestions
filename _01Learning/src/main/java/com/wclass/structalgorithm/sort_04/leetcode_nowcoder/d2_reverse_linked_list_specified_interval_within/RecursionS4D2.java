package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d2_reverse_linked_list_specified_interval_within;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName RecursionS4D2
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-01
 * @Version 1.0
 **/
public class RecursionS4D2 {

    ListNode temp = null;
    public ListNode reverse(ListNode head, int n){
        //只颠倒第一个节点，后续不管
        if(n == 1){
            temp = head.next;
            return head;
        }
        //进入子问题
        ListNode node = reverse(head.next, n - 1);
        //反转
        head.next.next = head;
        //每个子问题反转后的尾拼接第n个位置后的节点
        head.next = temp;
        return node;
    }
    public ListNode reverseBetween (ListNode head, int m, int n) {
        //从第一个节点开始
        if(m == 1)
            return reverse(head, n);
        //缩减子问题
        ListNode node = reverseBetween(head.next, m - 1, n - 1);
        //拼接已翻转
        head.next = node;
        return head;
    }

}
