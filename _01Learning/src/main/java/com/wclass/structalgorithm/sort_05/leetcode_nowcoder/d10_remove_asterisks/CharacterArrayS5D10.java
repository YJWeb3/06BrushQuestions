package com.wclass.structalgorithm.sort_05.leetcode_nowcoder.d10_remove_asterisks;

/**
 * @program: StructAlgorithm
 * @ClassName CharacterArrayS5D10
 * @description:
 * @author: W哥
 * @create: 2024-09-24-21-15
 * @Version 1.0
 **/
public class CharacterArrayS5D10 {

    public String removeStars(String s) {
        int n = s.length();
        char[] st = new char[n];
        int head = -1;

        for(int i = 0; i < n;i ++) {
            char ch = s.charAt(i);
            if(ch == '*') head --;
            else st[++head] = ch;
        }
        return String.valueOf(st,0,head+1); //param: char arr, offset, count
    }

}
