package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d13_crack_safe_box;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: StructAlgorithm
 * @ClassName HierholzerS7D13
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-51
 * @Version 1.0
 **/
public class HierholzerS7D13 {

    Set<Integer> seen = new HashSet<Integer>();
    StringBuffer ans = new StringBuffer();
    int highest;
    int k;

    public String crackSafe(int n, int k) {
        highest = (int) Math.pow(10, n - 1);
        this.k = k;
        dfs(0);
        for (int i = 1; i < n; i++) {
            ans.append('0');
        }
        return ans.toString();
    }

    public void dfs(int node) {
        for (int x = 0; x < k; ++x) {
            int nei = node * 10 + x;
            if (!seen.contains(nei)) {
                seen.add(nei);
                dfs(nei % highest);
                ans.append(x);
            }
        }
    }

}
