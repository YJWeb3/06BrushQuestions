package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d11_kth_last_node;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName FirstFindLengthFindFinalk
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-16
 * @Version 1.0
 **/
public class FirstFindLengthFindFinalKS4D11 {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        int n = 0;
        ListNode p = pHead;
        //遍历链表，统计链表长度
        while(p != null){
            n++;
            p = p.next;
        }
        //长度过小，返回空链表
        if(n < k)
            return null;
        p = pHead;
        //遍历n-k次
        for(int i = 0; i < n - k; i++)
            p = p.next;
        return p;
    }

}
