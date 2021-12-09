package com.wangxiaohu;


public class LeetCode206 {

    /**
     * 递归反转整个链表
     * 递归函数的定义是：输入一个节点head，将「以head为起点」的链表反转，并返回反转之后的头结点。
     * 时间复杂度：O（N）
     * 空间复杂度：O（N）
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = reverseList(head.next);
        // 将第个二节点的指针指向第一个节点
        head.next.next = head;
        // 将第一个节点的指针指向 null
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