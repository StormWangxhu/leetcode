package com.wangxiaohu;

import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        LeetCode76 leetCode76 = new LeetCode76();
        System.out.println("Test Result = " + leetCode76.getSolution(s, t));
    }

    public String getSolution(String s, String t) {
        char[] sources = s.toCharArray();
        char[] target = t.toCharArray();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        if (sources.length < target.length) {
            return "";
        }
        for (int i = 0; i < target.length; i++) {
            need.put(target[i], need.getOrDefault(target[i], 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < sources.length) {
            char c = sources[right];
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 判断左侧窗口是否收缩
            while (valid == target.length) {
                //更新最短子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                // d 是将移出窗口的字符
                char d = sources[left];
                // 左移窗口
                left++;
                // 进行窗口内的数据更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
