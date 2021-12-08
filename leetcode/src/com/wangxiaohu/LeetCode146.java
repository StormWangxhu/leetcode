package com.wangxiaohu;

import java.util.LinkedHashMap;

public class LeetCode146 {

    /**
     * 题目：146. LRU 缓存机制
     * leetcode:https://leetcode-cn.com/problems/lru-cache/
     * 实现思路：哈希链表
     * LRU 缓存机制特点：
     * 1、查询快（哈希表的特点）
     * 2、插入快（链表特点）
     * 3、删除快（链表特点）
     * 4、数据有顺序（链表特点）
     * 时间复杂度：O（1）
     */
    class LRUCache {

        private int size;
        LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.size = capacity;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            }
            // 将 key 变为最近使用
            makeKeyRecently(key);
            return cache.get(key);
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                // 修改 key 的值
                cache.put(key, value);
                // 将 key 变为最近使用
                makeKeyRecently(key);
                return;
            }
            // 如果不存在
            // 缓存满了
            if (cache.size() >= this.size) {
                // 链表头部就是最久未使用的 key
                int oldestKey = cache.keySet().iterator().next();
                cache.remove(oldestKey);
            }

            // 将新的 key 添加链表尾部
            cache.put(key, value);
        }

        private void makeKeyRecently(int key) {
            int val = cache.get(key);
            // 删除 key，重新插入到队尾
            cache.remove(key);
            cache.put(key, val);
        }
    }
}
