package davidch.leetcode.challenges.n1171;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        final var preHead = new ListNode(0, head);

        final var previousElements = new ListNode[1001];
        previousElements[0] = preHead;
        var peIdx = 0;

        var curr = preHead.next;
        while (curr != null) {
            previousElements[++peIdx] = curr;
            var i = peIdx;

            var sum = 0;
            while (i > 0) {
                sum += previousElements[i].val;
                i--;
                if (sum == 0) {
                    previousElements[i].next = curr.next;
                    peIdx = i;
                    break;
                }
            }

            curr = curr.next;
        }

        return preHead.next;
    }
}
