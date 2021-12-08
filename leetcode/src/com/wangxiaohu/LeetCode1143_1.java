package com.wangxiaohu;

public class LeetCode1143_1 {

    /**
     * 题目：1143.最长公共子序列
     * 定义：s1[0..i-1] 和 s2[0..j-1] 的 lcs 长度为 dp[i][j]
     * 目标：s1[0..m-1] 和 s2[0..n-1] 的 lcs 长度，即 dp[m][n]
     * 思路：自底向上的 dp 数组的动态规划思路
     *
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        // base case: dp[0][..] = dp[..][0] = 0
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 现在 i 和 j 从 1 开始，所以要减一
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // s1[i-1] 和 s2[j-1] 必然在 lcs 中
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // s1[i-1] 和 s2[j-1] 至少有一个不在 lcs 中
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
