package davidch.leetcode.challenges.n24;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        var previous = new ListNode(0, head);
        final var previousToNewHead = previous;

        var current = head;
        while (current != null && current.next != null) {
            previous.next = current.next;
            current.next = current.next.next;
            previous.next.next = current;

            previous = current;
            current = current.next;
        }

        return previousToNewHead.next;
    }
}
