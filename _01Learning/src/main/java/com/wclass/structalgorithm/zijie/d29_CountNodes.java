package com.wclass.structalgorithm.zijie;

/**
 * ClassName:d29_CountNodes
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:36
 * @Author:NieZheng
 * @Version:1.0
 */
public class d29_CountNodes {

    public class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    public int countNodes(ListNode head){

        if (head == null){
            return 0;
        }
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

}
