package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d0_entity;


import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName Node
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-37
 * @Version 1.0
 **/
public class Node {

    public int val;
    public Node next;
    public Node random;
    public ArrayList<Node> neighbors;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }

}
