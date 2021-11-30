package com.wangxiaohu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode652 {

    // 记录所有子树以及其出现的频率
    Map<String, Integer> memo = new HashMap<>();
    // 记录重复的子树根节点
    List<TreeNode> res = new ArrayList<>();

    /**
     * leetcode652:寻找重复的子树
     * 题目：https://leetcode-cn.com/problems/find-duplicate-subtrees/
     * 参考：https://labuladong.gitee.io/algo/2/18/23/
     *
     * @param root
     * @return
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    /**
     * 以输入[1,2,3,4,null,2,4,null,null,4]为例：其subTree如下：
     * subTree:#,#,4
     * subTree:#,#,4,#,2
     * subTree:#,#,4
     * subTree:#,#,4,#,2
     * subTree:#,#,4
     * subTree:#,#,4,#,2,#,#,4,3
     * subTree:#,#,4,#,2,#,#,4,#,2,#,#,4,3,1
     *
     * @param root
     * @return
     */
    private String traverse(TreeNode root) {
        if (root == null) {
            // 表示空指针
            return "#";
        }
        // 将左右子树序列化成字符串
        String left = traverse(root.left);
        String right = traverse(root.right);

        // 左右子树加上自己，就是以自己为根的二叉树的序列化结果，这里拼接的是后序遍历顺序。
        // 也可以以前序或者中序拼接，这里只是为了描述一颗二叉树的样子
        String subTree = left + "," + right + "," + root.val;
        System.out.println("subTree:" + subTree);

        int freq = memo.getOrDefault(subTree, 0);
        if (freq == 1) {
            // 有人和自己重复，将自己加入结果列表
            res.add(root);
        }
        // 给子树对应的出现次数加 1
        memo.put(subTree, freq + 1);
        return subTree;
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
