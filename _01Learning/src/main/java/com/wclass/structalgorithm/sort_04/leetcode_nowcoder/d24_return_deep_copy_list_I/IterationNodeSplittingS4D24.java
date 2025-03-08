package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d24_return_deep_copy_list_I;

import com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d0_entity.Node;

/**
 * @program: StructAlgorithm
 * @ClassName IterationNodeSplittingS4D24
 * @description:
 * @author: W哥
 * @create: 2024-10-01-10-02
 * @Version 1.0
 **/
public class IterationNodeSplittingS4D24 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeNew = new Node(node.val);
            nodeNew.next = node.next;
            node.next = nodeNew;
        }
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeNew = node.next;
            nodeNew.random = (node.random != null) ? node.random.next : null;
        }
        Node headNew = head.next;
        for (Node node = head; node != null; node = node.next) {
            Node nodeNew = node.next;
            node.next = node.next.next;
            nodeNew.next = (nodeNew.next != null) ? nodeNew.next.next : null;
        }
        return headNew;
    }

}
