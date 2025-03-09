package com.wclass.brush.cache.d4_fifo;

import java.util.*;
/**
 * @program: 06BrushQuestions
 * @ClassName FIFOCache
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-46
 * @Version 1.0
 **/
public class FIFOCache<K, V> {
    private final int capacity;
    private final Queue<K> queue;
    private final Map<K, V> cache;

    public FIFOCache(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
        this.cache = new HashMap<>();
    }

    public void put(K key, V value) {
        // 如果缓存已满，先淘汰最早加入的数据
        if (cache.size() == capacity) {
            K oldestKey = queue.poll();
            cache.remove(oldestKey);
        }

        // 加入新数据
        queue.offer(key);
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }
}