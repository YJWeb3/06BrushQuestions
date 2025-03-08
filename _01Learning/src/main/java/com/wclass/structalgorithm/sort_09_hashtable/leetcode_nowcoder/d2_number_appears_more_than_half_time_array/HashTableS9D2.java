package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d2_number_appears_more_than_half_time_array;

import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D2
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-05
 * @Version 1.0
 **/
public class HashTableS9D2 {

    public int MoreThanHalfNum_Solution(int [] array) {
        //哈希表统计每个数字出现的次数
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        //遍历数组
        for(int i = 0; i < array.length; i++){
            //统计频率
            if(!mp.containsKey(array[i]))
                mp.put(array[i], 1);
            else
                mp.put(array[i], mp.get(array[i]) + 1);
            //一旦有个数大于长度一半的情况即可返回
            if(mp.get(array[i]) > array.length / 2)
                return array[i];
        }
        return 0;
    }

}
