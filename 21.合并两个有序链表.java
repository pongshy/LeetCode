/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode head = new ListNode(0);
        ListNode pre = head;

        while (p != null && q != null) {
            if (p.val < q.val) {
                pre.next = new ListNode(p.val);
                p = p.next;
            } else {
                pre.next = new ListNode(q.val);
                q = q.next;
            }

            pre = pre.next;
        }
        pre.next = p == null ? q : p;
        
        return head.next;
    }
}
// @lc code=end

