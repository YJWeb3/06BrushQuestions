package com.wclass.brush.cache.d2_lfu;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @program: 06BrushQuestions
 * @ClassName LFUCache
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-45
 * @Version 1.0
 **/
public class LFUCache<K, V> {
    private final int capacity;
    private final HashMap<K, V> keyToVal;
    private final HashMap<K, Integer> keyToFreq;
    private final HashMap<Integer, LinkedHashSet<K>> freqToKeys;
    private int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeys = new HashMap<>();
        this.minFreq = 0;
    }

    public V get(K key) {
        if (!keyToVal.containsKey(key)) {
            return null;
        }
        increaseFreq(key);
        return keyToVal.get(key);
    }

    public void put(K key, V value) {
        if (capacity <= 0) {
            return;
        }
        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            increaseFreq(key);
            return;
        }
        if (keyToVal.size() >= capacity) {
            removeMinFreqKey();
        }
        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.putIfAbsent(1, new LinkedHashSet<>());
        freqToKeys.get(1).add(key);
        minFreq = 1;
    }

    private void increaseFreq(K key) {
        int freq = keyToFreq.get(key);
        keyToFreq.put(key, freq + 1);
        freqToKeys.get(freq).remove(key);
        freqToKeys.putIfAbsent(freq + 1, new LinkedHashSet<>());
        freqToKeys.get(freq + 1).add(key);
        if (freqToKeys.get(freq).isEmpty() && freq == minFreq) {
            minFreq = freq + 1;
        }
    }

    private void removeMinFreqKey() {
        LinkedHashSet<K> keyList = freqToKeys.get(minFreq);
        K deletedKey = keyList.iterator().next();
        keyList.remove(deletedKey);
        if (keyList.isEmpty()) {
            freqToKeys.remove(minFreq);
        }
        keyToVal.remove(deletedKey);
        keyToFreq.remove(deletedKey);
    }
}