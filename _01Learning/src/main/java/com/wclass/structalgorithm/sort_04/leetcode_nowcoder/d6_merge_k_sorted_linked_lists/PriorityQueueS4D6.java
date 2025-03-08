package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d6_merge_k_sorted_linked_lists;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName PriorityQueueS4D6
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-08
 * @Version 1.0
 **/
public class PriorityQueueS4D6 {

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        //小顶堆
        Queue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);
        //遍历所有链表第一个元素
        for(int i = 0; i < lists.size(); i++){
            //不为空则加入小顶堆
            if(lists.get(i) != null)
                pq.add(lists.get(i));
        }
        //加一个表头
        ListNode res = new ListNode(-1);
        ListNode head = res;
        //直到小顶堆为空
        while(!pq.isEmpty()){
            //取出最小的元素
            ListNode temp = pq.poll();
            //连接
            head.next = temp;
            head = head.next;
            //每次取出链表的后一个元素加入小顶堆
            if(temp.next != null)
                pq.add(temp.next);
        }
        //去掉表头
        return res.next;
    }

}
