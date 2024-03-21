package davidch.leetcode.challenges.n206;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode current = null;
        var next = head;
        while (next != null) {
            final var nextNext = next.next;
            next.next = current;
            current = next;
            next = nextNext;
        }

        return current;
    }
}
