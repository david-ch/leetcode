package davidch.leetcode.challenges.n234;

import java.util.Objects;

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
            return val + "";// + (next == null ? "" : (", " + next));
        }
    }
}
