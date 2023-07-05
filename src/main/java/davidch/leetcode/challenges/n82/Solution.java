package davidch.leetcode.challenges.n82;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    private static final int NOT_POSSIBLE_VALUE = -999;

    public ListNode deleteDuplicates(ListNode head) {
        final var beforeHead = new ListNode(NOT_POSSIBLE_VALUE, head);

        var prev = beforeHead;
        var current = prev.next;
        var lastRemovedValue = NOT_POSSIBLE_VALUE;
        while (current != null) {
            if (current.val == lastRemovedValue || (current.next != null && current.val == current.next.val)) {
                lastRemovedValue = current.val;
                prev.next = current.next;
            } else {
                prev = prev.next;
            }

            current = prev.next;
        }

        return beforeHead.next;
    }
}
