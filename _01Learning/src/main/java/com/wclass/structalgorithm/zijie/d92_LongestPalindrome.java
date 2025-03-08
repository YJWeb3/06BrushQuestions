package com.wclass.structalgorithm.zijie;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:d92_LongestPalindrome
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/18 14:44
 * @Author:NieZheng
 * @Version:1.0
 */
public class d92_LongestPalindrome {

    // version 1
    public int longestPalindrome(String s){
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if (set.contains(c) )
                set.remove(c);
            else
                set.add(c);
        }
        int remove = set.size();
        if (remove > 0)
            remove -= 1;
        return s.length() - remove;
    }

    // version 2
    public int longestPalindrome2(String s){
        int[] charStatArray = new int[52];
        int oneTimeOddCount = 0;
        int evenCount = 0;

        for (char ch : s.toCharArray()){
            if (ch >= 97){
                charStatArray[26 + ch -'a']++;
            }else {
                charStatArray[ch - 'A']++;
            }
        }
        for (int cnt : charStatArray){
            if (cnt != 0){
                if (cnt % 2 == 0){
                    evenCount += cnt;
                }else {
                    if (cnt == 1){
                        oneTimeOddCount++;
                    }else {
                        evenCount += cnt - 1;
                        oneTimeOddCount++;
                    }
                }
            }
        }
        return oneTimeOddCount > 0 ? 1 + evenCount : evenCount;
    }
}
