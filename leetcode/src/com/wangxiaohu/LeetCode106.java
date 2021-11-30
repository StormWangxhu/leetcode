package com.wangxiaohu;

public class LeetCode106 {

    /**
     * leetcode106:从中序与后序遍历序列构造二叉树
     * 题目链接：https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
     * 参考：https://labuladong.gitee.io/algo/2/18/22/
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int pStart, int pEnd) {
        if (inStart > inEnd) {
            return null;
        }

        int rootVal = postorder[pEnd];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        // 这个数值leftSize是左子树一共的节点数，
        // 所以后序遍历左子树的闭区间是[pStart,pStart + leftSize - 1],
        // 后序遍历右子树的闭区间是[pStart+leftSize,pEnd-1]，因为最后一位是根节点的值
        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(inorder, inStart, index - 1, postorder, pStart, pStart + leftSize - 1);
        root.right = build(inorder, index + 1, inEnd, postorder, pStart + leftSize, pEnd - 1);
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
