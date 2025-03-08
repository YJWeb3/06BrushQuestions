package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d37_search_recommendation_system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: StructAlgorithm
 * @ClassName SortBinaryS1D37
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-50
 * @Version 1.0
 **/
public class SortBinaryS1D37 {

    public List<List<String>> suggestedProducts(String[] ps, String w) {
        Arrays.sort(ps);
        int n = ps.length;
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            String cur = w.substring(0, i + 1);
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (ps[mid].compareTo(cur) >= 0) r = mid;
                else l = mid + 1;
            }
            List<String> list = new ArrayList<>();
            if (ps[r].compareTo(cur) >= 0) {
                for (int j = r; j <= Math.min(n - 1, r + 2); j++) {
                    if (ps[j].length() < cur.length()) break;
                    if (!ps[j].substring(0, i + 1).equals(cur)) break;
                    list.add(ps[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

}
