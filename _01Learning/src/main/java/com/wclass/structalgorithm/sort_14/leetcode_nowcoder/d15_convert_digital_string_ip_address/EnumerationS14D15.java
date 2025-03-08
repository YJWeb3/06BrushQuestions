package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d15_convert_digital_string_ip_address;

import java.util.ArrayList;

/**
 * @program: StructAlgorithm
 * @ClassName EnumerationS14D1
 * @description:
 * @author: W哥
 * @create: 2024-09-21-21-13
 * @Version 1.0
 **/
public class EnumerationS14D15 {

    public ArrayList<String> restoreIpAddresses (String s) {
        ArrayList<String> res = new ArrayList<String>();
        int n = s.length();
        //遍历IP的点可能的位置（第一个点）
        for(int i = 1; i < 4 && i < n - 2; i++){
            //第二个点的位置
            for(int j = i + 1; j < i + 4 && j < n - 1; j++){
                //第三个点的位置
                for(int k = j + 1; k < j + 4 && k < n; k++){
                    //最后一段剩余数字不能超过3
                    if(n - k >= 4)
                        continue;
                    //从点的位置分段截取
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);
                    //IP每个数字不大于255
                    if(Integer.parseInt(a) > 255 || Integer.parseInt(b) > 255 || Integer.parseInt(c) > 255 || Integer.parseInt(d) > 255)
                        continue;
                    //排除前导0的情况
                    if((a.length() != 1 && a.charAt(0) == '0') || (b.length() != 1 && b.charAt(0) == '0') ||  (c.length() != 1 && c.charAt(0) == '0') || (d.length() != 1 && d.charAt(0) == '0'))
                        continue;
                    //组装IP地址
                    String temp = a + "." + b + "." + c + "." + d;
                    res.add(temp);
                }
            }
        }
        return res;
    }

}
