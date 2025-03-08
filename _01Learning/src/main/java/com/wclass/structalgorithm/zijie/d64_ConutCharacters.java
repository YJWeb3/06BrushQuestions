package com.wclass.structalgorithm.zijie;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:d64_ConutCharacters
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 14:25
 * @Author:NieZheng
 * @Version:1.0
 */
public class d64_ConutCharacters {

    public Map<Character,Integer> countCharacters(String str){

        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c) + 1);
            }
        }
        return map;
    }

}
