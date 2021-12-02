package com.wangxiaohu;

public class LeetCode236 {

    /**
     * 题目：236. 二叉树的最近公共祖先
     * leetcode:https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
     * 参考：https://labuladong.gitee.io/algo/2/18/30/
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        // root本身就是 p 节点，如果 q 存在于以 root 为根的树中，显然 root 就是 LCA；
        // 如果 q 不存在，自身也是自身的祖先，应该返回 root 节点。反之亦然
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 情况 1：p,q 都在以 root 为根的树中
        if (left != null && right != null) {
            return root;
        }

        // 情况 2：p,q 都不在以 root 为根的树中
        if (left == null && right == null) {
            return null;
        }

        // 情况3：p,q 只有一个存在于 root 为根的树中
        return left == null ? right : left;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
