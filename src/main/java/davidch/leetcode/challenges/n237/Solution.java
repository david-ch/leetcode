package davidch.leetcode.challenges.n237;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        if (prev != null) prev.next = null;
    }
}
