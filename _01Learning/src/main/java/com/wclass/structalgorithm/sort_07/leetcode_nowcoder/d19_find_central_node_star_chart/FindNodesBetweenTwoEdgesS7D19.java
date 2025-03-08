package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d19_find_central_node_star_chart;

/**
 * @program: StructAlgorithm
 * @ClassName FindNodesBetweenTwoEdgesS7D19
 * @description:
 * @author: W哥
 * @create: 2024-10-01-21-02
 * @Version 1.0
 **/
public class FindNodesBetweenTwoEdgesS7D19 {

    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }

}
