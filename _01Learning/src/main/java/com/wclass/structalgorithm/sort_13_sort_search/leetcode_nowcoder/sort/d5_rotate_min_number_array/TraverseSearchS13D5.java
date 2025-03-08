package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.sort.d5_rotate_min_number_array;

/**
 * @program: StructAlgorithm
 * @ClassName TraverseSearchS13D5
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-22
 * @Version 1.0
 **/
public class TraverseSearchS13D5 {

    public int minNumberInRotateArray(int [] array) {
        //数组一定有元素
        int res = array[0];
        //遍历数组
        for(int i = 1; i < array.length; i++)
            //每次维护最小值
            res = Math.min(res, array[i]);
        return res;
    }

}
