package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d15_smallest_number_k;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName JdkSortS5D15
 * @description:
 * @author: W哥
 * @create: 2024-09-24-22-06
 * @Version 1.0
 **/
public class JdkSortS5D15 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        //排除特殊情况
        if(k == 0 || input.length == 0)
            return res;
        //排序
        Arrays.sort(input);
        //因为k<=input.length,取前k小
        for(int i = 0; i < k; i++){
            res.add(input[i]);
        }
        return res;
    }

}
