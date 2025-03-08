package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d52_training_plan_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS2D52
 * @description:
 * @author: W哥
 * @create: 2024-09-19-21-24
 * @Version 1.0
 **/
public class TwoPointersS2D52 {

    public ListNode trainningPlan(ListNode head, int cnt) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && cnt > 0) {
            fast = fast.next;
            cnt--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

}
