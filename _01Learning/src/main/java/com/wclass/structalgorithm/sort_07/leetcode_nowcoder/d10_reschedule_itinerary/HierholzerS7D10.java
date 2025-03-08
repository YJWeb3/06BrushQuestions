package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d10_reschedule_itinerary;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName HierholzerS7D10
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-44
 * @Version 1.0
 **/
public class HierholzerS7D10 {

    Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    List<String> itinerary = new LinkedList<String>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<String>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    public void dfs(String curr) {
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }

}
