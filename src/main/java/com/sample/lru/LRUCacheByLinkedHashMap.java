package com.sample.lru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class LRUCacheByLinkedHashMap extends LinkedHashMap<Integer, Integer> {
    private int capacity;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public LRUCacheByLinkedHashMap(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        try {
            lock.readLock().lock();
            return super.getOrDefault(key, -1);
        } finally {
            lock.readLock().unlock();
        }
    }


    public void put(int key, int value) {
        try {
            lock.writeLock().lock();
            super.put(key, value);
        } finally {
            lock.writeLock().unlock();
        }
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}

