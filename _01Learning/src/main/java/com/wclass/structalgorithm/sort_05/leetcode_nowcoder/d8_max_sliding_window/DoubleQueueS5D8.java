package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d8_max_sliding_window;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName DoubleQueueS5D8
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-11
 * @Version 1.0
 **/
public class DoubleQueueS5D8 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        //窗口大于数组长度的时候，返回空
        if(size <= num.length && size != 0){
            //双向队列
            ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
            //先遍历一个窗口
            for(int i = 0; i < size; i++){
                //去掉比自己先进队列的小于自己的值
                while(!dq.isEmpty() && num[dq.peekLast()] < num[i])
                    dq.pollLast();
                dq.add(i);
            }
            //遍历后续数组元素
            for(int i = size; i < num.length; i++){
                //取窗口内的最大值
                res.add(num[dq.peekFirst()]);
                while(!dq.isEmpty() && dq.peekFirst() < (i - size + 1))
                    //弹出窗口移走后的值
                    dq.pollFirst();
                //加入新的值前，去掉比自己先进队列的小于自己的值
                while(!dq.isEmpty() && num[dq.peekLast()] < num[i])
                    dq.pollLast();
                dq.add(i);
            }
            res.add(num[dq.pollFirst()]);
        }
        return res;
    }

}
