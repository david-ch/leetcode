package davidch.leetcode.challenges.n234;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;

        var middle = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }

        final var secondHalfHead = middle.next;
        middle.next = null;

        var prev = secondHalfHead;
        var current = prev.next;
        prev.next = null;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        var end = prev;
        while (head != null && end != null) {
            if (head.val != end.val) return false;
            head = head.next;
            end = end.next;
        }

        return true;
    }
}
