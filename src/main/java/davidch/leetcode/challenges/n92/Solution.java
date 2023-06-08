package davidch.leetcode.challenges.n92;

import java.util.Objects;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        var beforeHead = new ListNode(-1000, head);

        var beforeReversedRange = beforeHead;
        for (var i = 1; i < left; i++) {
            beforeReversedRange = beforeReversedRange.next;
        }

        var prev = beforeReversedRange;
        var cur = beforeReversedRange.next;
        for (var i = left; i <= right; i++) {
            var next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        beforeReversedRange.next.next = cur;
        beforeReversedRange.next = prev;

        return beforeHead.next;
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

        @Override
        public String toString() {
            return val + (next == null ? "" : (", " + next));
        }
    }
}
