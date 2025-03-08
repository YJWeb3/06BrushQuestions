package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d52_training_plan_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName SequentialSearchS2D52
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-24
 * @Version 1.0
 **/
public class SequentialSearchS2D52 {

    public ListNode trainningPlan(ListNode head, int cnt) {
        int n = 0;
        ListNode node = null;

        for (node = head; node != null; node = node.next) {
            n++;
        }
        for (node = head; n > cnt; n--) {
            node = node.next;
        }

        return node;
    }

}
