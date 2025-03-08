package com.wclass.structalgorithm.sort_04.leetcode_nowcoder.d0_entity;

/**
 * @program: StructAlgorithm
 * @ClassName Node
 * @description:
 * @author: W哥
 * @create: 2024-10-01-10-01
 * @Version 1.0
 **/
public class Node {

    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

}
