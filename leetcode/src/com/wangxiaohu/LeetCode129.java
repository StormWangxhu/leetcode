package com.wangxiaohu;

public class LeetCode129 {

    class Solution {
        public int sumNumbers(LeetCode1038.TreeNode root) {

            return traverse(root, 0);
        }

        public int traverse(LeetCode1038.TreeNode root, int preSum) {
            if (root == null) {
                return 0;
            }
            int sum = preSum * 10 + root.val;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                return traverse(root.left, sum) + traverse(root.right, sum);
            }

        }
    }
}
