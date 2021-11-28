package com.wangxiaohu;

public class LeetCode116 {

    /**
     * 116. 填充每个节点的下一个右侧节点指针
     * https://labuladong.gitee.io/algo/2/18/21/
     * 将每一层二叉树节点连接起来」可以细化成「将每两个相邻节点都连接起来」
     *
     * @param root
     * @return
     */
    Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }

    /**
     * 连接两个相邻节点
     *
     * @param node1
     * @param node2
     */
    private void connectTwoNode(Node node1, Node node2) {

        // base case
        if (node1 == null || node2 == null) {
            return;
        }
        // 将传入的两个节点相连
        node1.next = node2;

        // 连接相同父节点的两个子节点
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);

        // 连接跨越父节点的两个子节点
        connectTwoNode(node1.right, node1.left);

    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
