package com.wangxiaohu;

public class LeetCode654 {


    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTreeNode(nums, 0, nums.length - 1);
    }

    /**
     * 将nums[lo..hi] 构造成符条件的树，返回根节点
     * 题目：654. 最大二叉树
     * leetcode654:https://leetcode-cn.com/problems/maximum-binary-tree/
     * 参考：https://labuladong.gitee.io/algo/2/18/22/
     *
     * @param nums
     * @param lo
     * @param hi
     * @return
     */
    private static TreeNode buildTreeNode(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = buildTreeNode(nums, lo, index - 1);
        root.right = buildTreeNode(nums, index + 1, hi);
        return root;
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
