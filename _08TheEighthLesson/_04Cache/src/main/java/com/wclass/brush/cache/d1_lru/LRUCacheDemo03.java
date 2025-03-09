package com.wclass.brush.cache.d1_lru;

import java.util.HashMap;
import java.util.Map;
/**
 * @program: 06BrushQuestions
 * @ClassName LRUCacheMemo
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-49
 * @Version 1.0
 **/
public class LRUCacheDemo03<K, V> {
    // 双向链表节点
    private class Node {
        K key;
        V value;
        Node prev;
        Node next;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<K, Node> cache = new HashMap<>();
    private Node head = new Node(null, null); // 虚拟头节点
    private Node tail = new Node(null, null); // 虚拟尾节点

    public LRUCacheDemo03(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    // 获取缓存值并更新访问顺序
    public V get(K key) {
        if (!cache.containsKey(key)) return null;
        Node node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    // 写入缓存值，触发淘汰机制
    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            if (cache.size() > capacity) {
                Node removed = removeTail();
                cache.remove(removed.key);
            }
        }
    }

    // 辅助方法：将节点移至链表头部
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    // 辅助方法：添加节点到头部
    private void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    // 辅助方法：移除尾部节点
    private Node removeTail() {
        Node last = tail.prev;
        removeNode(last);
        return last;
    }

    // 辅助方法：移除指定节点
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}