package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d14_couples_holding_hands;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS7D14
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-54
 * @Version 1.0
 **/
public class BFSS7D14 {

    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int tot = n / 2;

        List<Integer>[] graph = new List[tot];
        for (int i = 0; i < tot; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i += 2) {
            int l = row[i] / 2;
            int r = row[i + 1] / 2;
            if (l != r) {
                graph[l].add(r);
                graph[r].add(l);
            }
        }
        boolean[] visited = new boolean[tot];
        int ret = 0;
        for (int i = 0; i < tot; i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<Integer>();
                visited[i] = true;
                queue.offer(i);
                int cnt = 0;

                while (!queue.isEmpty()) {
                    int x = queue.poll();
                    cnt += 1;

                    for (int y : graph[x]) {
                        if (!visited[y]) {
                            visited[y] = true;
                            queue.offer(y);
                        }
                    }
                }
                ret += cnt - 1;
            }
        }
        return ret;
    }

}
