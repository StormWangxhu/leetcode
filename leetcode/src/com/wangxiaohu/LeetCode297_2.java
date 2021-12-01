package com.wangxiaohu;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode297_2 {

    /**
     * 题目：二叉树的序列化和反序列化
     * 层级遍历方式解法
     *
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // 初始化队列，将 root 加入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            // 在这里处理，层级遍历代码位置
            if (cur == null) {
                sb.append("#").append(",");
                continue;
            }
            sb.append(cur.val).append(",");
            /*****/


            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        String[] nodes = data.split(",");
        // 第一个元素就是 root的值
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        // 队列 queue 记录父节点，将 root 加入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < nodes.length; ) {
            // 队列中存的都是父节点
            TreeNode parent = queue.poll();

            // 父节点对应的左侧节点的值
            String left = nodes[i++];
            if (!left.equals("#")) {
                parent.left = new TreeNode(Integer.parseInt(left));
                queue.offer(parent.left);
            } else {
                parent.left = null;
            }

            // 父节点对应的右侧子节点的值
            String right = nodes[i++];
            if (!right.equals("#")) {
                parent.right = new TreeNode(Integer.parseInt(right));
                queue.offer(parent.right);
            } else {
                parent.right = null;
            }
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
    }

    /**
     * 层级遍历代码框架
     *
     * @param root
     */
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 初始化队列，将 root 加入队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            // 层级遍历代码位置
            System.out.println(root.val);

            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}
