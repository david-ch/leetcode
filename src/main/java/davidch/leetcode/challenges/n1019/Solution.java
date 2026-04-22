package davidch.leetcode.challenges.n1019;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

import java.util.Stack;

public class Solution {
    public int[] nextLargerNodes(ListNode head) {
        var n = 0;

        ListNode current = null;
        var next = head;
        while (next != null) {
            var nextNext = next.next;
            next.next = current;
            current = next;
            next = nextNext;
            n++;
        }

        final var result = new int[n];
        final var nextGreater = new Stack<Integer>();
        var i = n - 1;
        while (current != null) {
            while (!nextGreater.isEmpty() && nextGreater.peek() <= current.val)
                nextGreater.pop();
            if (!nextGreater.isEmpty())
                result[i] = nextGreater.peek();

            nextGreater.push(current.val);
            i--;
            current = current.next;
        }

        return result;
    }
}
