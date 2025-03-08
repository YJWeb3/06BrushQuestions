package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d15_smallest_number_k;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @program: StructAlgorithm
 * @ClassName HeapSortS5D15
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-05
 * @Version 1.0
 **/
public class HeapSortS5D15 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        //排除特殊情况
        if(k == 0 || input.length == 0)
            return res;
        //大根堆
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2)->o2.compareTo(o1));
        //构建一个k个大小的堆
        for(int i = 0; i < k; i++)
            q.offer(input[i]);
        for(int i = k; i < input.length; i++){
            //较小元素入堆
            if(q.peek() > input[i]){
                q.poll();
                q.offer(input[i]);
            }
        }
        //堆中元素取出入数组
        for(int i = 0; i < k; i++)
            res.add(q.poll());
        return res;
    }

}
