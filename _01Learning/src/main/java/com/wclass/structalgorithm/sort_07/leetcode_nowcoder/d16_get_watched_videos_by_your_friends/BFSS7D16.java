package com.wclass.structalgorithm.sort_07.leetcode_nowcoder.d16_get_watched_videos_by_your_friends;

import java.util.*;

/**
 * @program: StructAlgorithm
 * @ClassName BFSS7D16
 * @description:
 * @author: W哥
 * @create: 2024-10-01-20-57
 * @Version 1.0
 **/
public class BFSS7D16 {

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {

        int n = watchedVideos.size();
        boolean[] visited = new boolean[n];
        visited[id] = true;
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(id);

        while (!queue.isEmpty() && level > 0) {
            level--;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                int[] currFriends = friends[curr];

                for (int friend : currFriends) {
                    if (!visited[friend]) {
                        visited[friend] = true;
                        queue.offer(friend);
                    }
                }
            }
        }

        Map<String, Integer> counts = new HashMap<String, Integer>();

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            List<String> currVideos = watchedVideos.get(curr);
            for (String video : currVideos) {
                counts.put(video, counts.getOrDefault(video, 0) + 1);
            }
        }

        List<String> videosByFriends = new ArrayList<String>(counts.keySet());

        Collections.sort(videosByFriends, (a, b) -> {
            int count1 = counts.get(a), count2 = counts.get(b);
            if (count1 != count2) {
                return count1 - count2;
            } else {
                return a.compareTo(b);
            }
        });
        return videosByFriends;
    }

}
