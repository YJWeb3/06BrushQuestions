package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d24_return_deep_copy_list_I;


import com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d0_entity.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName BacktrackingHashTableS4D24
 * @description:
 * @author: W哥
 * @create: 2024-10-01-10-00
 * @Version 1.0
 **/
public class BacktrackingHashTableS4D24 {

    Map<Node, Node> cachedNode = new HashMap<Node, Node>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }

}
