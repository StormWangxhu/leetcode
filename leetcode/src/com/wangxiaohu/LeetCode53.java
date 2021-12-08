package com.wangxiaohu;

public class LeetCode53 {

    /**
     * 一维动态规划
     * 思路：
     * dp 数组的含义：以 nums[i] 为结尾的「最大子数组和」为 dp[i]
     * dp[i] 有两种「选择」，要么与前面的相邻子数组连接，形成一个和更大的子数组；要么不与前面的子数组连接，自成一派，即自己最大。
     * 在这两种选择中择优，就可以计算出最大子数组，
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];

        // base case,第一个元素前面没有子数组，就是它本身
        dp[0] = nums[0];

        // 状态转移方程
        // 对于当前元素 i，有两种选择，要么自身是最大子数组和，要么
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /**
     * 状态压缩，空间复杂度：O（1）
     *
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        // base case,第一个元素前面没有子数组，就是它本身
        int dp_0 = nums[0];
        int dp_1 = 0, res = dp_0;

        // 状态转移方程
        // 对于当前元素 i，有两种选择，要么自身是最大子数组和，要么
        for (int i = 1; i < n; i++) {
            dp_1 = Math.max(nums[i], nums[i] + dp_0);
            dp_0 = dp_1;
            res = Math.max(res, dp_1);
        }

        return res;
    }
}
