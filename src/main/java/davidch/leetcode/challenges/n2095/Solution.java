package davidch.leetcode.challenges.n2095;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        final var preHead = new ListNode(0, head);

        var slow = preHead;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return preHead.next;
    }
}
