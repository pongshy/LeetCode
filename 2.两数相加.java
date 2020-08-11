/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //带头节点的链表
        ListNode head = new ListNode(0);
        ListNode nextNode = head;
        int i = 0;
        while (l1 != null || l2 != null) {
            int x = 0;
            if (l1 != null) {
                x = l1.val;
            }
            int y = 0;
            if (l2 != null) {
                y = l2.val;
            }
            int sum = x + y + i;
            
            nextNode.next = new ListNode(sum % 10);
            nextNode = nextNode.next;
            i = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (i > 0) {
            nextNode.next = new ListNode(i);
        }

        return head.next;
    }
}
// @lc code=end

