package com.wangxiaohu;

public class LeetCode700 {

    /**
     * 题目：700. 二叉搜索树中的搜索
     * leetcode：https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {

        // base case
        if (root == null) {
            return null;
        }

        // 找到了，返回
//        if (root.val == val) {
//            return root;
//        }
        // 当前值比目标值大，去左子树找
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        // 当前值比目标值小，去右子树找
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        // 这一步，相当于是上面两个条件都不成立，即找到了。
        return root;
    }

    public class TreeNode {
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
