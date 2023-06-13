package davidch.leetcode.challenges.n328;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {

    public ListNode oddEvenList(ListNode head) {
        final var oddPart = new ListNode(0, null);
        var oddPartEnd = oddPart;
        final var evenPart = new ListNode(0, null);
        var evenPartEnd = evenPart;

        var current = head;
        var isOdd = true;

        while (current != null) {
            if (isOdd) {
                oddPartEnd.next = current;
                oddPartEnd = current;
            } else {
                evenPartEnd.next = current;
                evenPartEnd = current;
            }

            isOdd = !isOdd;
            current = current.next;
        }

        evenPartEnd.next = null;
        oddPartEnd.next = evenPart.next;
        return oddPart.next;
    }
}
