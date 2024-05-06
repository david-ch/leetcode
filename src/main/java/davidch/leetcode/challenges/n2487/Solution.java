package davidch.leetcode.challenges.n2487;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode removeNodes(ListNode head) {
        if (head.next == null) return head;

        final var tail = removeNodes(head.next);
        if (head.val < tail.val) {
            return tail;
        } else {
            head.next = tail;
            return head;
        }
    }
}
