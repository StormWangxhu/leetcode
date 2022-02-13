package com.wangxiaohu;

public class LeetCode111 {
    class Solution {
        int min = 0;

        int minDepth(LeetCode1038.TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            if (left == 0 || right == 0) {
                return left + right + 1;
            }
            return Math.min(left, right) + 1;
        }
    }
}
