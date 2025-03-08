package com.wclass.structalgorithm.sort_13_sort_search.leetcode_nowcoder.search.d1_crack_password_pass_level;

import java.util.Arrays;

/**
 * @program: StructAlgorithm
 * @ClassName QuickSortS13D1
 * @description:
 * @author: W哥
 * @create: 2024-10-06-22-08
 * @Version 1.0
 **/
public class QuickSortS13D1 {

    public String crackPassword(int[] password) {
        String[] strs = new String[password.length];
        for(int i = 0; i < password.length; i++)
            strs[i] = String.valueOf(password[i]);
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }

    void quickSort(String[] strs, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while(i < j) {
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }

    public String crackPassword02(int[] password) {
        String[] strs = new String[password.length];
        for(int i = 0; i < password.length; i++)
            strs[i] = String.valueOf(password[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }
}
