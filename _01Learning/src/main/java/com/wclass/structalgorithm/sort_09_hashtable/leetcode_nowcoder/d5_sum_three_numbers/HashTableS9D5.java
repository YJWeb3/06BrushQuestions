package com.wclass.structalgorithm.sort_09_hashtable.leetcode_nowcoder.d5_sum_three_numbers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName HashTableS9D5
 * @description:
 * @author: W哥
 * @create: 2024-10-03-23-10
 * @Version 1.0
 **/
public class HashTableS9D5 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer>>();
        int n = num.length;
        //不够三元组
        if(n < 3)
            return res;
        //排序
        Arrays.sort(num);
        for(int i = 0; i < n - 2; i++){
            if(i != 0 && num[i] == num[i - 1])
                continue;
            //后续的收尾双指针
            int left = i + 1;
            int right = n - 1;
            //设置当前数的负值为目标
            int target = -num[i];
            while(left < right){
                //双指针指向的二值相加为目标，则可以与num[i]组成0
                if(num[left] + num[right] == target){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num[i]);
                    temp.add(num[left]);
                    temp.add(num[right]);
                    res.add(temp);
                    while(left + 1 < right && num[left] == num[left + 1])
                        //去重
                        left++;
                    while(right - 1 > left && num[right] == num[right - 1])
                        //去重
                        right--;
                    //双指针向中间收缩
                    left++;
                    right--;
                }
                //双指针指向的二值相加大于目标，右指针向左
                else if(num[left] + num[right] > target)
                    right--;
                    //双指针指向的二值相加小于目标，左指针向右
                else
                    left++;
            }
        }
        return res;
    }

}
