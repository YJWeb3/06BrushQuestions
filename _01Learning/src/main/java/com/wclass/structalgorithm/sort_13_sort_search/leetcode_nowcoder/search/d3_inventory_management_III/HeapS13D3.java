package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d3_inventory_management_III;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName HeapS13D3
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-12
 * @Version 1.0
 **/
public class HeapS13D3 {

    public int[] inventoryManagement(int[] stock, int cnt) {
        int[] vec = new int[cnt];
        if (cnt == 0) { // 排除 0 的情况
            return vec;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        for (int i = 0; i < cnt; ++i) {
            queue.offer(stock[i]);
        }
        for (int i = cnt; i < stock.length; ++i) {
            if (queue.peek() > stock[i]) {
                queue.poll();
                queue.offer(stock[i]);
            }
        }
        for (int i = 0; i < cnt; ++i) {
            vec[i] = queue.poll();
        }
        return vec;
    }

}
