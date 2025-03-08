package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:d25_Intersection
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/6 16:01
 * @Author:NieZheng
 * @Version:1.0
 */
public class d25_Intersection {

    public int[] intersection(int[] nums1,int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i]) + 1);
            }else {
                map.put(nums1[i],1);
            }
        }
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                results.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }
        }
        int result[] = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            result[i] = results.get(i);
        }
        return result;
    }
}
