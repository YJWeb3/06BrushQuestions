package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d1_norepeat;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName Arrang02
 * @description: 语雀 https://www.yuque.com/zhengge-jehzj/za7u7s/dvvwq6fumzfc3yt2#fXYRn
 * @author: W哥
 * @create: 2024-09-04-00-39
 * @Version 1.0
 **/

// 题一：没有重复项数字的全排列
// 方法二：非递归版
public class IterationS1D1 {

    // 所有的排列结果集
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    // 步骤一：置换
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        // 先对res中加入一个空的list，给第一次插入制造一个空间。
        res.add(list);
        // 整个循环的次数为num的元素个数
        for(int i = 0; i < num.length; i++){

            ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
            // 遍历此时的排列结果
            for(ArrayList<Integer> r:res){
                // 根据集合的大小，使用for循环在可插入的位置进行插入
                for(int j = 0; j < r.size()+1; j++){
                    // 在第j个位置插入
                    r.add(j,num[i]);
                    // 此时构成新的排列集合，可能是不完整的排列集合（例如：[1,2];[2,1]这类）
                    ArrayList<Integer> temp = new ArrayList<>(r);
                    // 放进去tmp临时集合中
                    tmp.add(temp);
                    // 将刚插入的数移除掉，为了将同样的这个插入不同的位置
                    r.remove(j);
                }
            }
            // 最后赋给res进行返回
            res = new ArrayList<>(tmp);
        }
        return res;
    }

}
