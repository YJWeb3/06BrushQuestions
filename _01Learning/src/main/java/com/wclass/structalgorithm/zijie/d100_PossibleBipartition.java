package com.wclass.structalgorithm.zijie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:d100_PossibleBipartition
 * Package:com.yj.nz.zijie
 * Description:描述
 *
 * @Date:2023/2/22 13:10
 * @Author:NieZheng
 * @Version:1.0
 */
public class d100_PossibleBipartition {

    ArrayList<Integer>[] adj;
    Map<Integer,Integer> color;

    public boolean possibleBiparttition(int N,int[][] dislikes){
        adj = new ArrayList[N+1];
        for (int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();

        for (int[] edge : dislikes){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        
        color = new HashMap<>();
        for (int i = 1; i < N; i++)
            if (!color.containsKey(i) && !dfs(i,0))
                return false;
            return true;
    }

    private boolean dfs(int node, int c) {
        if (color.containsKey(node))
            return color.get(node) == c;
        color.put(node,c);

        for (int nei : adj[node])
            if (!dfs(nei,c ^ 1))
                return false;
            return true;
    }
}
