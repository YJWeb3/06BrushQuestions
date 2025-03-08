package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/**
 * ClassName:d63_NameDeduplication
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/10 14:13
 * @Author:NieZheng
 * @Version:1.0
 */
public class d63_NameDeduplication {


    // 方式一：HashMap
    public List<String> nameDepulication(String[] names){
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String str = names[i].toLowerCase();
            if ( !map.containsKey(str) ){
                map.put(str,1);
                result.add(str);
            }
        }
        return result;
    }

    // 方式二
    public List<String> nameDepulication2(String[] names){
        List<String> result = new ArrayList<>();

        for (String name : names){
            if (!result.contains(name.toLowerCase())){
                result.add(name.toLowerCase());
            }
        }
        return result;
    }

}
