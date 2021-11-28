package com.wangxiaohu;

public class LeetCode226 {

    /**
     * 题目：翻转二叉树，将整棵树的节点翻转
     * leetcode:https://leetcode-cn.com/problems/invert-binary-tree/
     * 关键词：二叉树、递归思想。
     * 写递归算法的关键是要明确函数的「定义」是什么，然后相信这个定义，利用这个定义推导最终结果，绝不要跳入递归的细节。
     * 写树相关的算法，简单说就是，先搞清楚当前 root 节点「该做什么」以及「什么时候做」，然后根据函数定义递归调用子节点，递归调用会让孩子节点做相同的事情。
     * 二叉树题目的一个难点就是，如何把题目的要求细化成每个节点需要做的事情。
     * <p>
     * 在这里：每个节点是交换其左右子节点的数值，因此可以将其放在前序遍历位置和后序遍历位置。
     *
     * @param root
     * @return
     */
    public static TreeNode invertTree(TreeNode root) {

        // base case
        if (root == null) {
            return null;
        }

        // 首先思考的是 root 节点要做什么，以及什么时候做
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
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
