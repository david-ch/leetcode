package davidch.leetcode.challenges.n2130;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public int pairSum(ListNode head) {
        ListNode beforeCursor = null;
        var cursor = head;

        var fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            var nextCursor = cursor.next;
            cursor.next = beforeCursor;
            beforeCursor = cursor;
            cursor = nextCursor;
        }

        var maxSum = 0;
        while (beforeCursor != null) {
            maxSum = Math.max(beforeCursor.val + cursor.val, maxSum);
            beforeCursor = beforeCursor.next;
            cursor = cursor.next;
        }

        return maxSum;
    }
}
