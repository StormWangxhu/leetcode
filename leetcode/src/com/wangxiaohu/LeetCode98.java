package com.wangxiaohu;

public class LeetCode98 {

    /**
     * 题目：98. 验证二叉搜索树
     * leetcode:https://leetcode-cn.com/problems/validate-binary-search-tree/
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }

        // 应该满足：min.val < root.val < max.val
        if (min != null && root.val <= min.val) {
            return false;
        }

        if (max != null && root.val >= max.val) {
            return false;
        }

        // 限定左子树的最大值是 root,右子树的最小值是 root
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
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
