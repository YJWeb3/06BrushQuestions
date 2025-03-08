package com.wclass.structalgorithm.sort_14.leetcode_nowcoder.d7_longest_common_substring;

/**
 * @program: StructAlgorithm
 * @ClassName enumerationS14D7
 * @description:
 * @author: W哥
 * @create: 2024-09-20-20-50
 * @Version 1.0
 **/
public class enumerationS14D7 {

    public String LCS (String str1, String str2) {
        int length = 0;
        String res = "";
        //遍历s1每个起始点
        for(int i = 0; i < str1.length(); i++){
            //遍历s2每个起点
            for(int j = 0; j < str2.length(); j++){
                int temp = 0;
                String temps = "";
                int x = i, y = j;
                //比较每个起点为始的子串
                while(x < str1.length() && y < str2.length() && str1.charAt(x) == str2.charAt(y)){
                    temps += str1.charAt(x);
                    x++;
                    y++;
                    temp++;
                }
                //更新更大的长度子串
                if(length < temp){
                    length = temp;
                    res = temps;
                }
            }
        }
        return res;
    }

}
