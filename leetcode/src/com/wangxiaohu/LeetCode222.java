package com.wangxiaohu;

public class LeetCode222 {

    /**
     * 题目：计算完全二叉树的节点数
     * leetcode222:https://leetcode-cn.com/problems/count-complete-tree-nodes/
     * 参考：https://labuladong.gitee.io/algo/2/18/31/
     *
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        TreeNode l = root, r = root;
        int hl = 0, hr = 0;
        // 计算左子树的高度
        while (l != null) {
            l = l.left;
            hl++;
        }
        // 计算右子树的高度
        while (r != null) {
            r = r.right;
            hr++;
        }
        // 如果左右子树的高度相同，则为满二叉树
        if (hl == hr) {
            return (int) (Math.pow(2, hr) - 1);
        }
        // 否则就是普通二叉树的节点数
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static class TreeNode {
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
