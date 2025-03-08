package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d10_linked_list_cycle_II;

import com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d0_entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS4D10
 * @description:
 * @author: W哥
 * @create: 2024-09-29-22-13
 * @Version 1.0
 **/
public class HashTableS4D10 {

    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

}
