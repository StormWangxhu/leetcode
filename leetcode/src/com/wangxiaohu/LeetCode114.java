package com.wangxiaohu;

public class LeetCode114 {

    /**
     * 我们再梳理一下，如何按题目要求把一棵树拉平成一条链表？很简单，以下流程：
     * 1、将 root 的左子树和右子树拉平。
     * 2、将 root 的右子树接到左子树下方，然后将整个左子树作为右子树。
     * <p>
     * 参考：https://labuladong.gitee.io/algo/2/18/21/
     *
     * @param root
     */
    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // 将 root的左右子树拉平
        flatten(root.left);
        flatten(root.right);

        /**** 后序遍历位置 ****/
        // 1、左右子树已经被拉平成一条链表
        TreeNode left = root.left;
        // 原先右子树
        TreeNode right = root.right;

        // 2、将左子树作为右子树
        root.left = null;
        root.right = left;

        // 3、将原先的右子树接到当前右子树的末端
        TreeNode p = root;
        while (p.right != null) {
            // 当前右子树的末端
            p = p.right;
        }
        p.right = right;
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
