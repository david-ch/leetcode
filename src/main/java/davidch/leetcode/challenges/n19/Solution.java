package davidch.leetcode.challenges.n19;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        final var beforeHead = new ListNode(0, head);

        var fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        var current = beforeHead;
        while (fast != null) {
            fast = fast.next;
            current = current.next;
        }

        current.next = current.next.next;

        return beforeHead.next;
    }
}
