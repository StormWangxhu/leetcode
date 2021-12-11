package com.wangxiaohu;


public class LeetCode234 {

    /**
     * 判断是否为回文链表
     * 思路一： 将链表反转(递归反转、原地反转、借助栈 Stack)，然后和原链表比较
     * 思路二：快慢指针
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head.next == null || head == null) {
            return true;
        }
        ListNode newHead = reverse(head);
        ListNode n1 = head;
        ListNode n2 = newHead;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
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