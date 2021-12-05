package com.wangxiaohu;

public class LeetCode509_01 {

    /**
     * 带备忘录的递归解法
     * 题目：509. 斐波那契数
     * leetcode:https://leetcode-cn.com/problems/fibonacci-number/
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        // 备忘录全初始化为 0
        int[] memo = new int[n + 1];
        return helper(memo, n);
    }

    private int helper(int[] memo, int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // 已经计算过，不用再计算了
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }
}
