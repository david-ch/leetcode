package davidch.leetcode.challenges.n92;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        var beforeHead = new ListNode(-1000, head);

        var beforeReversedRange = beforeHead;
        for (var i = 1; i < left; i++) {
            beforeReversedRange = beforeReversedRange.next;
        }

        var prev = beforeReversedRange;
        var cur = beforeReversedRange.next;
        for (var i = left; i <= right; i++) {
            var next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        beforeReversedRange.next.next = cur;
        beforeReversedRange.next = prev;

        return beforeHead.next;
    }
}
