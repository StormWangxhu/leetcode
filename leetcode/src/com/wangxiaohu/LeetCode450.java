package com.wangxiaohu;

public class LeetCode450 {

    /**
     * 题目：450. 删除二叉搜索树中的节点
     * leetcode:https://leetcode-cn.com/problems/delete-node-in-a-bst/
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            // 要删除的节点没有子节点
            if (root.left == null && root.right == null) {
                return null;
            }
            // 只有一个子节点
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // 有两个子节点
            if (root.left != null && root.right != null) {
                TreeNode max = getMax(root.left);
                root.left = deleteNode(root.left, max.val);
                max.left = root.left;
                max.right = root.right;
                root = max;
            }
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    /**
     * 获取左子树的最大值，去它的右子树中找
     *
     * @param root
     * @return
     */
    private TreeNode getMax(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
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
