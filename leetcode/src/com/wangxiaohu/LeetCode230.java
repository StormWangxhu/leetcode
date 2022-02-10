package com.wangxiaohu;

/**
 * leetcode230:二叉搜索树中第K小的元素
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * 思路：二叉搜索树的中序遍历是有序且升序的
 */
public class LeetCode230 {
    int res = 0;
    int rank = 0;

    public int kthSmallest(TreeNode root, int k) {
        reverse(root, k);
        return res;
    }

    public void reverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        reverse(root.left, k);
        rank++;
        if (rank == k) {
            res = root.val;
            return;
        }
        reverse(root.right, k);
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
