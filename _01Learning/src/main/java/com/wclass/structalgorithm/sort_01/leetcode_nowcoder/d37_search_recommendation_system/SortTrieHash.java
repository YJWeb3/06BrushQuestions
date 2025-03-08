package com.wclass.structalgorithm.sort_01.leetcode_nowcoder.d37_search_recommendation_system;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName SortTrieHash
 * @description:
 * @author: W哥
 * @create: 2024-09-12-21-49
 * @Version 1.0
 **/
public class SortTrieHash {

    int[][] tr = new int[20010][26];
    int idx = 0;
    Map<Integer, Integer> min = new HashMap<>(), max = new HashMap<>();
    void add(String s, int num) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (tr[p][u] == 0) {
                tr[p][u] = ++idx;
                min.put(tr[p][u], num);
            }
            max.put(tr[p][u], num);
            p = tr[p][u];
        }
    }
    int[] query(String s) {
        int a = -1, b = -1, p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (tr[p][u] == 0) return new int[]{-1, -1};
            a = min.get(tr[p][u]); b = max.get(tr[p][u]);
            p = tr[p][u];
        }
        return new int[]{a, b};
    }
    public List<List<String>> suggestedProducts(String[] ps, String w) {
        Arrays.sort(ps);
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < ps.length; i++) add(ps[i], i);
        for (int i = 0; i < w.length(); i++) {
            List<String> list = new ArrayList<>();
            int[] info = query(w.substring(0, i + 1));
            int l = info[0], r = info[1];
            for (int j = l; j <= Math.min(l + 2, r) && l != -1; j++) list.add(ps[j]);
            ans.add(list);
        }
        return ans;
    }

}
