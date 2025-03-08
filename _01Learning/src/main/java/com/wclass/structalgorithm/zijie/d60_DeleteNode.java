package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d60_DeleteNode
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 13:52
 * @Author:NieZheng
 * @Version:1.0
 */
public class d60_DeleteNode {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public void deleteNode(ListNode node){
        if (node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
