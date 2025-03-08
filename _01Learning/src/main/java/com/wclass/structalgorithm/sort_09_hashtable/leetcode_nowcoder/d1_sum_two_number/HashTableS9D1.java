package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d1_sum_two_number;

import java.util.HashMap;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D1
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-03
 * @Version 1.0
 **/
public class HashTableS9D1 {

    public int[] twoSum (int[] numbers, int target) {
        int[] res = new int[0];
        //创建哈希表,两元组分别表示值、下标
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        //在哈希表中查找target-numbers[i]
        for(int i = 0; i < numbers.length; i++){
            int temp = target - numbers[i];
            //若是没找到，将此信息计入哈希表
            if(!hash.containsKey(temp))
                hash.put(numbers[i], i);
                //否则返回两个下标+1
            else
                return new int[] {hash.get(temp) + 1, i + 1};
        }
        return res;
    }

}
