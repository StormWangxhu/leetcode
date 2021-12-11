package com.wangxiaohu;

public class LeetCode234_01 {

    /**
     * 判断链表是否为回文链表
     * 参考：https://labuladong.gitee.io/algo/2/17/19/
     * 时间复杂度：O（N）
     * 空间复杂度：O（1）
     *
     * @param head
     * @return
     */
    boolean isPalindrome(ListNode head) {
        // 快慢指针找到中间节点
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null)
            slow = slow.next;

        // 反转中间节点之后链表
        ListNode left = head;
        ListNode right = reverse(slow);

        // 进行比较
        while (right != null) {
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    /**
     * 原地反转链表
     * 空间复杂度 O（1）
     *
     * @param head
     * @return
     */
    ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
