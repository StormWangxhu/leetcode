package com.wangxiaohu;

import java.util.Arrays;

public class LeetCode1143 {

    /**
     * 定义 dp table 含义：
     * dp[i][j]： 表示 s1[i ...],s2[j...]的最长公共子序列的长度
     * base case ：当i,j 等于字符串长度最后时，返回 0，因为索引是从 0 开始，等于 长度的时候取的是空串
     * 思路：自顶向下带备忘录的动态规划思路
     *
     * @param text1
     * @param text2
     * @return
     */
    int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(text1, 0, text2, 0);
    }

    private int dp(String s1, int i, String s2, int j) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = dp(s1, i + 1, s2, j + 1) + 1;
        } else {
            memo[i][j] = Math.max(dp(s1, i + 1, s2, j), dp(s1, i, s2, j + 1));
        }
        return memo[i][j];
    }
}
