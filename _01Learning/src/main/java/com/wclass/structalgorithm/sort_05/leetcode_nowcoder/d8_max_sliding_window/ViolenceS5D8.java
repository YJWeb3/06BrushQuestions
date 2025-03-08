package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d8_max_sliding_window;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName ViolenceS5D8
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-11
 * @Version 1.0
 **/
public class ViolenceS5D8 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        //窗口大于数组长度的时候，返回空
        if(size <= num.length && size != 0)
            //数组后面要空出窗口大小，避免越界
            for(int i = 0; i <= num.length - size; i++){
                //寻找每个窗口最大值
                int max = 0;
                for(int j = i; j < i + size; j++){
                    if(num[j] > max)
                        max = num[j];
                }
                res.add(max);
            }
        return res;
    }

}
