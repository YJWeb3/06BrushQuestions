package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d9_clone_image;


import com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d0_entity.Node;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName DFSS7D9
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-36
 * @Version 1.0
 **/
public class DFSS7D9 {

    private HashMap<Node, Node> visited = new HashMap <> ();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        // 如果该节点已经被访问过了，则直接从哈希表中取出对应的克隆节点返回
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // 克隆节点，注意到为了深拷贝我们不会克隆它的邻居的列表
        Node cloneNode = new Node(node.val, new ArrayList());
        // 哈希表存储
        visited.put(node, cloneNode);

        // 遍历该节点的邻居并更新克隆节点的邻居列表
        for (Node neighbor: node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }

}
