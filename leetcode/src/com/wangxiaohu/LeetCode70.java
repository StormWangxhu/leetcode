package com.wangxiaohu;

public class LeetCode70 {

    /**
     * dp 数组迭代
     * 题目：70. 爬楼梯
     * leetcode:https://leetcode-cn.com/problems/climbing-stairs/
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        // dp[2]=2;这里不可以 dp[2]=2，因为假设输入 n=1的时候，dp 数组越界
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    
    /**
     * 带有备忘录的递给
     */
    int[] memo;

    public int climbStairs2(int n) {
        memo = new int[n + 1];
        return dp(n);
    }

    private int dp(int n) {
        if (n <= 2) {
            return n;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = dp(n - 1) + dp(n - 2);
        return memo[n];
    }

}
