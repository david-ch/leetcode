package davidch.leetcode.challenges.n2074;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode reverseEvenLengthGroups(ListNode head) {
        var group = 1;
        var prevGroupEnd = new ListNode(0, head);
        var currentGroupStart = prevGroupEnd.next;

        var prev = prevGroupEnd;
        var current = prev.next;

        while (current != null) {
            var i = group;
            while (i > 0 && current != null) {
                i--;
                prev = current;
                current = current.next;
            }

            if ((group - i) % 2 == 0) {
                prevGroupEnd.next = reverse(prevGroupEnd, current);
                currentGroupStart.next = current;
                prevGroupEnd = currentGroupStart;
            } else {
                prevGroupEnd.next = currentGroupStart;
                prevGroupEnd = prev;
            }

            currentGroupStart = current;
            group++;
        }

        return head;
    }

    private ListNode reverse(ListNode fromExclusive, ListNode toExclusive) {
        var prev = fromExclusive;
        var current = prev.next;
        while (current != toExclusive) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
