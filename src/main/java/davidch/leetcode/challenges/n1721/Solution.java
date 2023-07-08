package davidch.leetcode.challenges.n1721;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode swapNodes(ListNode head, int k) {
        var right = head;
        var fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            right = right.next;
            fast = fast.next;
        }

        var left = head;
        for (var i = 1; i < k; i++) {
            left = left.next;
        }

        swapValues(left, right);

        return head;
    }

    private void swapValues(ListNode left, ListNode right) {
        var buf = left.val;
        left.val = right.val;
        right.val = buf;
    }
}
