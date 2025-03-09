package com.wclass.brush.cache.d1_lru;

import java.util.HashMap;
import java.util.Map;
/**
 * @program: 06BrushQuestions
 * @ClassName LRUCache
 * @description:
 * @author: CodingW
 * @create: 2025-03-09-16-44
 * @Version 1.0
 **/
public class LRUCacheDemo01<K, V> {

    private final Map<K, Node> cache;
    private final int capacity;
    private Node head;
    private Node tail;

    public LRUCacheDemo01(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
    }

    public V get(K key) {
        Node node = cache.get(key);
        if (node == null) {
            return null;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(K key, V value) {
        Node node = cache.get(key);
        if (node == null) {
            node = new Node(key, value);
            cache.put(key, node);
            addNode(node);
            if (cache.size() > capacity) {
                Node removed = removeTail();
                cache.remove(removed.key);
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void moveToHead(Node node) {
        if (node == head) {
            return;
        }
        removeNode(node);
        addNode(node);
    }

    private void addNode(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void removeNode(Node node) {
        if (node == head) {
            head = node.next;
        } else if (node == tail) {
            tail = node.prev;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.next = null;
        node.prev = null;
    }

    private Node removeTail() {
        Node removed = tail;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return removed;
    }

    private class Node {
        private final K key;
        private V value;
        private Node prev;
        private Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}