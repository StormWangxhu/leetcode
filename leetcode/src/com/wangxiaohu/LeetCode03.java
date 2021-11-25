package com.wangxiaohu;


import java.util.HashMap;
import java.util.Map;

public class LeetCode03 {

    public static void main(String[] args) {
        String s = "au";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    /**
     * 无重复字符的最长子串
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * https://labuladong.gitee.io/algo/2/21/56/
     * 关键词：双指针、滑动窗口、哈希表
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        char[] chars = s.toCharArray();

        int left = 0, right = 0;
        int res = 0;//记录结果
        while (right < chars.length) {
            //c 是将移入窗口的字符
            char c = chars[right];
            // 右移窗口
            right++;
            // 进行窗口内的一系列数据的更新
            window.put(c, window.getOrDefault(c, 0) + 1);

            // 判断左侧窗口是否进行收缩
            while (window.get(c) > 1) {
                // d 是将移除窗口的数据
                char d = chars[left];
                // 左移窗口
                left++;
                // 进行窗口内数据的更新
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
