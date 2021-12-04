package com.wangxiaohu;

public class LeetCode701 {

    /**
     * 题目：701. 二叉搜索树中的插入操作
     * leetcode:https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // 找到空节点，就进行插入
        if (root == null) {
            return new TreeNode(val);
        }

        // 如果当前节点值小于要插入的值，则去右子树中插
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }

        // 如果当前节点值大于要插入的值，则去左子树中插入
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
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
