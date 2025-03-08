package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d19_remove_duplicates_sort_list_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName HashtableS4D19
 * @description:
 * @author: W哥
 * @create: 2024-10-01-09-45
 * @Version 1.0
 **/
public class HashtableS4D19 {

    public ListNode deleteDuplicates (ListNode head) {
        //空链表
        if(head == null)
            return null;
        Map<Integer,Integer> mp = new HashMap<>();
        ListNode cur = head;
        //遍历链表统计每个节点值出现的次数
        while(cur != null){
            if(mp.containsKey(cur.val))
                mp.put(cur.val, (int)mp.get(cur.val) + 1);
            else
                mp.put(cur.val,1);
            cur = cur.next;
        }
        ListNode res = new ListNode(0);
        //在链表前加一个表头
        res.next = head;
        cur = res;
        //再次遍历链表
        while(cur.next != null){
            //如果节点值计数不为1
            if(mp.get(cur.next.val) != 1)
                //删去该节点
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        //去掉表头
        return res.next;
    }

}
