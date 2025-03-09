package com.wclass.brush.cache.d1_lru;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * @program: 06BrushQuestions
 * @ClassName LRUCacheDemo02
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-59
 * @Version 1.0
 **/
public class LRUCacheDemo02<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCacheDemo02(int capacity) {
        super(capacity, 0.75f, true); // accessOrder=true表示按访问顺序排序
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // 容量超限时淘汰最旧条目
    }
}