package com.wclass.brush.cache.d3_rr;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
/**
 * @program: 06BrushQuestions
 * @ClassName CacheRR
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-45
 * @Version 1.0
 **/
public class CacheRR<K, V> {

    private int capacity; // 缓存容量
    private HashMap<K, V> map; // 用于存储缓存数据
    private Queue<K> queue; // 用于存储缓存数据的key，以便进行随机替换

    public CacheRR(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        queue = new LinkedList<>();
    }

    /**
     * 从缓存中获取数据
     * @param key 缓存数据的key
     * @return 缓存数据的value，若不存在则返回null
     */
    public synchronized V get(K key) {
        return map.get(key);
    }

    /**
     * 往缓存中添加数据
     * @param key 缓存数据的key
     * @param value 缓存数据的value
     */
    public synchronized void put(K key, V value) {
        // 如果缓存已满，则进行随机替换
        if (map.size() == capacity) {
            K randomKey = queue.poll();
            map.remove(randomKey);
        }
        // 添加新数据
        map.put(key, value);
        queue.offer(key);
    }

    /**
     * 获取缓存的大小
     * @return 缓存的大小
     */
    public synchronized int size() {
        return map.size();
    }

}