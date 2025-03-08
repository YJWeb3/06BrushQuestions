package com.wclass.structalgorithm.zijie;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:d111_LargestNumber
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/25 17:51
 * @Author:NieZheng
 * @Version:1.0
 */
public class d111_LargestNumber {

    class cmp implements Comparator<String> {
        public int compare(String a,String b){
            String ab = a.concat(b);
            String ba = b.concat(a);
            return ba.compareTo(ab);
        }
    }

    public String LargestNumber(int[] nums){
        int n = nums.length;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            // 把整型转换成字符串
            str[i] = String.valueOf(nums[i]);
        }
        // 按最优策略排序
        Arrays.sort(str,new cmp());
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = ans.concat(str[i]);
        }
        // 除去多余前导0的情况
        if (ans.charAt(0) == '0'){
            return "0";
        }
        return ans;
    }
}
