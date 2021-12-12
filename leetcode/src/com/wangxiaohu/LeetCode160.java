package com.wangxiaohu;

import java.util.HashSet;

public class LeetCode160 {

    /**
     * 双指针
     * 160. 相交链表
     * leetcode:https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     *
     * @param headA
     * @param headB
     * @return
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }

    /**
     * 双指针更精简写法
     *
     * @param headA
     * @param headB
     * @return
     */
    ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }


    /**
     * 利用额外的空间
     *
     * @param headA
     * @param headB
     * @return
     */
    ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p1 = headA;
        while (p1 != null && p1.next != null) {
            if (!set.contains(p1)) {
                set.add(p1);
                p1 = p1.next;
            }
        }
        ListNode p2 = headB;
        while (p2 != null && p2.next != null) {
            if (set.contains(p2)) {
                return p2;
            } else {
                p2 = p2.next;
            }
        }
        return null;
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
