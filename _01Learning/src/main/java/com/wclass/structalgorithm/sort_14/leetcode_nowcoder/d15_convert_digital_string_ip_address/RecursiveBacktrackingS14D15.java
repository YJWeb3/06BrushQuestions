package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d15_convert_digital_string_ip_address;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName RecursiveBacktrackingS14D15
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-14
 * @Version 1.0
 **/
public class RecursiveBacktrackingS14D15 {

    //记录分段IP数字字符串
    private String nums = "";
    //step表示第几个数字，index表示字符串下标
    public void dfs(String s, ArrayList<String> res, int step, int index){
        //当前分割出的字符串
        String cur = "";
        //分割出了四个数字
        if(step == 4){
            //下标必须走到末尾
            if(index != s.length())
                return;
            res.add(nums);
        }else{
            //最长遍历3位
            for(int i = index; i < index + 3 && i < s.length(); i++){
                cur += s.charAt(i);
                //转数字比较
                int num = Integer.parseInt(cur);
                String temp = nums;
                //不能超过255且不能有前导0
                if(num <= 255 && (cur.length() == 1 || cur.charAt(0) != '0')){
                    //添加点
                    if(step - 3 != 0)
                        nums += cur + ".";
                    else
                        nums += cur;
                    //递归查找下一个数字
                    dfs(s, res, step + 1, i + 1);
                    //回溯
                    nums = temp;
                }
            }
        }
    }
    public ArrayList<String> restoreIpAddresses (String s) {
        ArrayList<String> res = new ArrayList<String>();
        dfs(s, res, 0, 0);
        return res;
    }

}
