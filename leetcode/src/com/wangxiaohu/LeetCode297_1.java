package com.wangxiaohu;

import java.util.LinkedList;

/**
 * 题目：297，解法 2
 * leetcode297:https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/submissions/
 */
public class LeetCode297_1 {


    /**
     * 后序遍历序列化
     *
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeTree(root, sb);
        return sb.toString();
    }

    private void serializeTree(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#").append(",");
            return;
        }

        serializeTree(root.left, sb);
        serializeTree(root.right, sb);

        // 后序遍历序列化
        sb.append(root.val).append(",");
    }


    /**
     * 后序遍历反序列化
     *
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(",")) {
            nodes.addLast(s);
        }
        return deserializeStr(nodes);
    }

    private TreeNode deserializeStr(LinkedList<String> nodes) {

        if (nodes.isEmpty()) {
            return null;
        }

        // 从后往前取元素
        String rootVal = nodes.removeLast();
        if (rootVal.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(rootVal));
        // 这里要注意：因为从列表中后往前取元素，所以要先右子树，后左子树
        root.right = deserializeStr(nodes);
        root.left = deserializeStr(nodes);
        return root;
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
