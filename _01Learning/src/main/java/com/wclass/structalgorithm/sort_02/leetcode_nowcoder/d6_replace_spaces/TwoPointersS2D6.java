package com.wclass.structalgorithm.sort_02.leetcode_nowcoder.d6_replace_spaces;

/**
 * @program: StructAlgorithm
 * @ClassName TwoPointersS1D6
 * @description:
 * @author: W哥
 * @create: 2024-09-14-23-09
 * @Version 1.0
 **/
public class TwoPointersS2D6 {

    public String replaceSpace(String s) {
        if(s.length() == 0 || s == null) return s;
        StringBuilder str = new StringBuilder();
        //扩充空间，空格数量2倍
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                str.append("  ");
            }
        }
        if(str.length() == 0) return s;

        int j = s.length() - 1;//左指针
        s += str.toString();
        int i = s.length() - 1;//右指针
        char[] ch = s.toCharArray();
        while(j < i){
            if(ch[j] != ' ') ch[i] = ch[j];
            else{
                ch[i--] = '0';
                ch[i--] = '2';
                ch[i] = '%';
            }
            j--;
            i--;
        }
        return new String(ch);
    }

}
