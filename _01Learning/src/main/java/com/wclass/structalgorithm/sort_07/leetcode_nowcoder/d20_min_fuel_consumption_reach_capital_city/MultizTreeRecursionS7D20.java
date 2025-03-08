package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d20_min_fuel_consumption_reach_capital_city;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName MultizTreeRecursionS7D20
 * @description:
 * @author: W哥
 * @create: 2024-10-01-21-03
 * @Version 1.0
 **/
public class MultizTreeRecursionS7D20 {

    public long minimumFuelCost(int[][] roads, int seats) {
        // 构造图
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] road : roads) {
            graph.computeIfAbsent(road[0], k -> new ArrayList<>()).add(road[1]);
            graph.computeIfAbsent(road[1], k -> new ArrayList<>()).add(road[0]);
        }
        // 因为0节点没parent，所以随便填个不存在的节点值就行
        return process(0, graph, -1, seats)[1];
    }

    private long[] process(int node, Map<Integer, List<Integer>> graph, int parent, int seats) {
        List<Integer> nexts = graph.getOrDefault(node, new ArrayList<>());
        long size = 1, childrenCost = 0;
        for (int next : nexts) {
            // 因为我们建的是双向图，所以next里面是有父节点的，为了只从父向子遍历
            // 这里要过滤掉parent
            if (next == parent) {
                continue;
            }
            // 累加所有子节点的人数以及子节点的cost
            long[] info = process(next, graph, node, seats);
            size += info[0];
            childrenCost += info[1];
        }
        // 本节点的cost。0节点是无消耗的
        long thisCost = node == 0 ? 0 : (size + seats - 1) / seats;
        return new long[] {size, childrenCost + thisCost};
    }

}
