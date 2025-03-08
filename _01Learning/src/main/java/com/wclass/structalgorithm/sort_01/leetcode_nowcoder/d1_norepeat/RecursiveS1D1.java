package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d1_norepeat;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program: StructAlgorithm
 * @ClassName d1_arrange
 * @description: 语雀 https://www.yuque.com/zhengge-jehzj/za7u7s/dvvwq6fumzfc3yt2#fXYRn
 * @author: W哥
 * @create: 2024-09-04-00-37
 * @Version 1.0
 **/

// 题一：没有重复项数字的全排列
// 方法一：递归
public class RecursiveS1D1 {

    // 存所有排列的集合
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    // 步骤一：置换
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // 存一种排列
        LinkedList<Integer> list = new LinkedList<>();
        // 递归进行
        backTrack(num,list);
        return res;
    }

    // 步骤二：回溯
    public void backTrack(int[] num, LinkedList<Integer> list){
        // 当list中的长度等于数组的长度，则证明此时已经找到一种排列了
        if(list.size() == num.length){
            // add进返回结果集中
            res.add(new ArrayList<>(list));
            return;
        }
        // 遍历num数组
        for(int i = 0; i < num.length; i++){
            // 若当前位置中的数已经添加过了则跳过
            if(list.contains(num[i]))
                continue;
            // 选择该数
            list.add(num[i]);
            // 继续寻找
            backTrack(num,list);
            // 撤销最后一个
            list.removeLast();
        }
    }


}
