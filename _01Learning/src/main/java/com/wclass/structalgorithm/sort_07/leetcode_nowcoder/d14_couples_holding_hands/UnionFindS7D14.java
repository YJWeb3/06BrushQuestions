package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d14_couples_holding_hands;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: StructAlgorithm
 * @ClassName UnionFindS7D14
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-54
 * @Version 1.0
 **/
public class UnionFindS7D14 {

    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int tot = n / 2;
        int[] f = new int[tot];
        for (int i = 0; i < tot; i++) {
            f[i] = i;
        }

        for (int i = 0; i < n; i += 2) {
            int l = row[i] / 2;
            int r = row[i + 1] / 2;
            add(f, l, r);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < tot; i++) {
            int fx = getf(f, i);
            map.put(fx, map.getOrDefault(fx, 0) + 1);
        }

        int ret = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ret += entry.getValue() - 1;
        }
        return ret;
    }

    public int getf(int[] f, int x) {
        if (f[x] == x) {
            return x;
        }
        int newf = getf(f, f[x]);
        f[x] = newf;
        return newf;
    }

    public void add(int[] f, int x, int y) {
        int fx = getf(f, x);
        int fy = getf(f, y);
        f[fx] = fy;
    }

}
