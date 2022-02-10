package com.wangxiaohu;

public class LeetCode538 {

    /**
     * leetcode538：把二叉搜索树转换为累加树
     * https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
     * 思路：二叉搜索树的；两个特性之一，中序遍历有序。
     *
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        reverse(root);
        return root;
    }

    int sum = 0;

    public void reverse(TreeNode root) {
        if (root == null) {
            return;
        }
        reverse(root.right);
        sum += root.val;
        root.val = sum;
        reverse(root.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
