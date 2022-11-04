package davidch.leetcode.challenges.n876;

import java.util.Objects;

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode cursor = head;
        ListNode fastCursor = head;

        while (fastCursor != null && fastCursor.next != null) {
            cursor = cursor.next;
            fastCursor = fastCursor.next.next;
        }

        return cursor;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

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
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode linkedListFrom(int... vals) {
        ListNode lastNode = new ListNode(vals[0]);
        ListNode firstNode = lastNode;

        for (int i = 1; i < vals.length; i++) {
            final var nextNode = new ListNode(vals[i]);
            lastNode.next = nextNode;
            lastNode = nextNode;
        }

        return firstNode;
    }
}

