package davidch.leetcode.challenges.n19;

import java.util.Objects;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        final var beforeHead = new ListNode(0, head);

        var fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        var current = beforeHead;
        while (fast != null) {
            fast = fast.next;
            current = current.next;
        }

        current.next = current.next.next;

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
