package davidch.leetcode.challenges.n876;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode middleNode(ListNode head) {
        var cursor = head;
        var fastCursor = head;

        while (fastCursor != null && fastCursor.next != null) {
            cursor = cursor.next;
            fastCursor = fastCursor.next.next;
        }

        return cursor;
    }
}

