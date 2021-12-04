package com.wangxiaohu;

public class LeetCode96 {

    /**
     * 题目：96. 不同的二叉搜索树
     * leetcode：https://leetcode-cn.com/problems/unique-binary-search-trees/
     *
     * @param n
     * @return
     */
    int[][] memo;

    public int numTrees(int n) {
        memo = new int[n + 1][n + 1];
        // 计算闭区间 [1, n] 组成的 BST 个数
        return counts(1, n);
    }

    //计算闭区间 [lo, hi] 组成的 BST 个数
    private int counts(int lo, int hi) {
        // base case
        if (lo > hi) {
            return 1;
        }

        //查备忘录
        if (memo[lo][hi] != 0) {
            return memo[lo][hi];
        }

        int res = 0;
        // 穷举所有的根节点
        for (int i = lo; i <= hi; i++) {
            int left = counts(lo, i - 1);
            int right = counts(i + 1, hi);
            // 左右子树的组合数乘积是 BST 的总数
            res += left * right;
        }
        // 将结果存入备忘录
        memo[lo][hi] = res;
        return res;
    }
}
