package davidch.leetcode.challenges.n2;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final var beforeResult = new ListNode(0, null);
        var resultCurrent = beforeResult;

        var remainder = 0;
        while (l1 != null || l2 != null || remainder != 0) {
            final var l1Val = l1 == null ? 0 : l1.val;
            final var l2Val = l2 == null ? 0 : l2.val;

            final var sum = l1Val + l2Val + remainder;
            resultCurrent.next = new ListNode(sum % 10);
            resultCurrent = resultCurrent.next;
            remainder = sum / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return beforeResult.next;
    }
}
