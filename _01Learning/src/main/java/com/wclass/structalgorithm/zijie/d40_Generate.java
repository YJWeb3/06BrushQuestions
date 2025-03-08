package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;

/**
 * ClassName:d40_Generate
 * Package:com.yj.nz
 * Description:描述
 *
 * @Date:2023/2/7 16:10
 * @Author:NieZheng
 * @Version:1.0
 */
public class d40_Generate {

    public ArrayList<Integer> generate(int size){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            result.add(i);
        }
        return result;
    }

}
