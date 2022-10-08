package com.sample.lru;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentLRUCache {
    private final HashMap<Integer, LRUNode> cache;

    private final int cacheCapacity;
    private final LRUHelper lruHelper;
    private final Lock lock = new ReentrantLock();

    public ConcurrentLRUCache(int capacity) {
        cache = new HashMap<Integer, LRUNode>();
        lruHelper = new LRUHelper();
        cacheCapacity = capacity;
    }

    public int get(int key) {
        try {
            lock.lock();
            LRUNode node = cache.get(key);
            if (node == null)
                return -1;

            lruHelper.moveToHead(node);
            return node.value;
        } finally {
            lock.unlock();

        }
    }

    public void put(int key, int value) {
        try {
            lock.lock();
            LRUNode node = cache.get(key);
            if (node == null) {
                LRUNode newNode = new LRUNode(key, value);

                lruHelper.addNode(newNode);
                cache.put(key, newNode);

                if (cache.size() > cacheCapacity) {
                    LRUNode tail = lruHelper.popTail();
                    cache.remove(tail.key);
                }
            } else {
                node.value = value;
                lruHelper.moveToHead(node);
            }
        } finally {
            lock.unlock();
        }

    }

}

class LRUNode {
    int key;
    int value;
    LRUNode prev;
    LRUNode next;

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


class LRUHelper {
    private LRUNode head;
    private LRUNode tail;

    public LRUHelper() {
        this.head = new LRUNode(-1, -1);
        this.tail = new LRUNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public void addNode(LRUNode node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;

    }

    public void removeNode(LRUNode node) {
        LRUNode nxt = node.next;
        LRUNode pre = node.prev;

        node.prev.next = nxt;
        node.next.prev = pre;
    }

    public void moveToHead(LRUNode node) {
        removeNode(node);
        addNode(node);
    }

    public LRUNode popTail() {
        LRUNode node = tail.prev;
        removeNode(node);
        return node;
    }
}