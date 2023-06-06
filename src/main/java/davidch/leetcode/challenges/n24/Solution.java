package davidch.leetcode.challenges.n24;

import java.util.Objects;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        var previous = new ListNode(0, head);
        final var previousToNewHead = previous;

        var current = head;
        while (current != null && current.next != null) {
            previous.next = current.next;
            current.next = current.next.next;
            previous.next.next = current;

            previous = current;
            current = current.next;
        }

        return previousToNewHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}
