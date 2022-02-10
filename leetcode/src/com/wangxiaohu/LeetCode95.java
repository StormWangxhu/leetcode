package com.wangxiaohu;

import java.util.LinkedList;
import java.util.List;

public class LeetCode95 {

    /**
     * 题目：95. 不同的二叉搜索树 II
     * leetcode：https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
     * /TODO 需要再细看下
     *
     * @param n
     * @return
     */
    public static void main(String[] args) {
        generateTrees(3);
    }

    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return build(1, n);
    }

    private static List<TreeNode> build(int lo, int hi) {
        List<TreeNode> res = new LinkedList<>();
        if (lo > hi) {
            res.add(null);
            return res;
        }
        for (int i = lo; i <= hi; i++) {
            List<TreeNode> leftTree = build(lo, i - 1);
            List<TreeNode> rifhtTree = build(i + 1, hi);
            for (TreeNode left : leftTree) {
                for (TreeNode right : rifhtTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
