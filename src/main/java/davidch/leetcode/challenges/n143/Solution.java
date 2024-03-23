package davidch.leetcode.challenges.n143;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        // find middle
        var middle = head;
        var fast = head;
        while (fast.next != null && fast.next.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode prev = null;
        ListNode curr = middle;
        while (curr != null) {
            final var next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // merge two halves starting from first
        var first = head;
        var second = prev;
        while (first != null && second != null) {
            final var nextFirst = first.next;
            final var nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first = nextFirst;
            second = nextSecond;
        }
    }
}
