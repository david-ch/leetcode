package davidch.leetcode.challenges.n382;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    private final ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        var current = head;
        var count = 0;
        var res = 0;
        while (current != null) {
            count++;
            if (Math.random() * count == 0) res = current.val;
            current = current.next;
        }
        return res;
    }
}
