package davidch.leetcode.challenges.n1290;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public int getDecimalValue(ListNode head) {
        var result = 0;
        for (; head != null; head = head.next) {
            result = result << 1 | head.val;
        }

        return result;
    }
}
