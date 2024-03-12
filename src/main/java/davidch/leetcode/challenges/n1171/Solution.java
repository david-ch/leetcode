package davidch.leetcode.challenges.n1171;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) return null;
        var curr = head;
        var sum = 0;
        while (curr != null) {
            sum += curr.val;
            if (sum == 0) return removeZeroSumSublists(curr.next);
            curr = curr.next;
        }

        head.next = removeZeroSumSublists(head.next);
        return head;
    }
}
