package davidch.leetcode.challenges.n203;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        final var beforeHead = new ListNode(0, head);

        var prev = beforeHead;
        var current = prev.next;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
        }

        return beforeHead.next;
    }
}
