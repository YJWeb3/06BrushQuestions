package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d3_two_numbers_appear_once_array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D3
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-06
 * @Version 1.0
 **/
public class HashTableS9D3 {

    public int[] FindNumsAppearOnce (int[] array) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        //遍历数组
        for(int i = 0; i < array.length; i++)
            //统计每个数出现的频率
            if(!mp.containsKey(array[i]))
                mp.put(array[i], 1);
            else
                mp.put(array[i], mp.get(array[i]) + 1);
        //再次遍历数组
        for(int i = 0; i < array.length; i++)
            //找到频率为1的两个数
            if(mp.get(array[i]) == 1)
                res.add(array[i]);
        //整理次序
        if(res.get(0) < res.get(1))
            return new int[] {res.get(0), res.get(1)};
        else
            return new int[] {res.get(1), res.get(0)};
    }

}
