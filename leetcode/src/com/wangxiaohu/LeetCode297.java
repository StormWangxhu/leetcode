package com.wangxiaohu;

import java.util.LinkedList;

public class LeetCode297 {

    /**
     * 前序遍历序列化
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
        // 前序遍历位置
        sb.append(root.val).append(",");

        serializeTree(root.left, sb);
        serializeTree(root.right, sb);
    }

    /**
     * 前序遍历反序列化
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
        String first = nodes.removeFirst();
        if (first.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(first));

        root.left = deserializeStr(nodes);
        root.right = deserializeStr(nodes);
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
