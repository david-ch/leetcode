package davidch.leetcode.challenges.n707;

import java.util.Objects;

public class MyLinkedList {

    private final ListNode beforeHead = new ListNode(0);
    private ListNode tail;

    public MyLinkedList(int... values) {
        if (values.length == 0) return;

        beforeHead.next = new ListNode(values[0]);
        var current = beforeHead.next;
        for (var i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        tail = current;
    }

    public int get(int index) {
        if (index < 0) return -1;

        var current = beforeHead.next;
        while (index > 0) {
            if (current == null) return -1;
            current = current.next;
            index--;
        }
        return current == null ? -1 : current.val;
    }

    public void addAtHead(int val) {
        beforeHead.next = new ListNode(val, beforeHead.next);
        if (beforeHead.next.next == null) tail = beforeHead.next;
    }

    public void addAtTail(int val) {
        final var newTail = new ListNode(val, null);
        if (beforeHead.next == null) {
            beforeHead.next = newTail;
        } else {
            tail.next = newTail;
        }
        tail = newTail;
    }

    public void addAtIndex(int index, int val) {
        var prev = beforeHead;
        while (index > 0 && prev.next != null) {
            prev = prev.next;
            index--;
        }

        if (index > 0) return;

        prev.next = new ListNode(val, prev.next);
        if (prev == tail) {
            tail = prev.next;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0) return;

        var prev = beforeHead;
        while (index > 0 && prev.next != null) {
            prev = prev.next;
            index--;
        }

        if (prev.next == null) return;
        if (prev.next == tail) tail = prev;

        prev.next = prev.next.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList that = (MyLinkedList) o;
        return Objects.equals(beforeHead, that.beforeHead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beforeHead);
    }

    @Override
    public String toString() {
        return beforeHead.next == null ? "" : beforeHead.next.toString();
    }

    private static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
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
