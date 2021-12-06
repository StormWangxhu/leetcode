package com.wangxiaohu;

import java.util.Arrays;

public class LeetCode300 {

    /**
     * 题目：300. 最长递增子序列
     * leetcode:https://leetcode-cn.com/problems/longest-increasing-subsequence/
     * dp数组定义：dp[i] 表示以 nums[i] 结尾的最长递增子序列的长度
     *
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        // base case
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
