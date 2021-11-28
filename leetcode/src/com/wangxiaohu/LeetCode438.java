package com.wangxiaohu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode438 {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    /**
     * 题目：找到字符串中所有字母异位词
     * leetcode:https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
     * 关键词：滑动窗口、双指针、哈希表
     * 参考文章：https://labuladong.gitee.io/algo/2/21/56/
     *
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        char[] schars = s.toCharArray();
        char[] pchars = p.toCharArray();

        for (int i = 0; i < p.length(); i++) {
            need.put(pchars[i], need.getOrDefault(pchars[i], 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        List<Integer> result = new ArrayList<>();

        while (right < schars.length) {
            char c = schars[right];
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 判断左侧窗口是否要收缩
            while (right - left >= pchars.length) {
                // 当窗口符合条件时，把起始索引加入 res
                if (valid == need.size()) {
                    result.add(left);
                }

                // 进行窗口内数据的一系列更新
                char d = schars[left];
                left++;
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        valid--;
                    }
                }
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
        }
        return result;
    }
}
