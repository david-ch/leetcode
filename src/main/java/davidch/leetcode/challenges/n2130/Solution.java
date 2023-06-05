package davidch.leetcode.challenges.n2130;

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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
