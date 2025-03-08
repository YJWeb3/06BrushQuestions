package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ClassName:d88_SubarraySum
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/18 0:18
 * @Author:NieZheng
 * @Version:1.0
 */
public class d88_SubarraySum {

    public ArrayList<Integer> subarraySum(int[] nums){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();

        // 初始化
        hash.put(0,-1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            // 累加前缀和
            sum += nums[i];

            // 前缀和曾经出现，即这个区间的和为0
            if (hash.containsKey(sum)){
                result.add(hash.get(sum) + 1);
                result.add(i);
                break;
            }

            // 前缀和第一次出现，存入hash
            hash.put(sum,i);
        }

        return result;
    }
}
