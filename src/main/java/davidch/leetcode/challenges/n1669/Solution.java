package davidch.leetcode.challenges.n1669;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        final var beforeHead = new ListNode(-1, list1);
        b -= a;

        var beforeA = beforeHead;
        while (a > 0) {
            beforeA = beforeA.next;
            a--;
        }

        var afterB = beforeA.next;
        while (b > -1) {
            afterB = afterB.next;
            b--;
        }

        beforeA.next = list2;

        var list2Last = list2;
        while (list2Last.next != null) list2Last = list2Last.next;

        list2Last.next = afterB;

        return beforeHead.next;
    }
}
