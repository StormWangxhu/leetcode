package com.wangxiaohu;

public class LeetCode1038 {

    public TreeNode bstToGst(TreeNode root) {
        reverse(root);
        return root;
    }

    int sum = 0;

    private void reverse(TreeNode root) {
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
