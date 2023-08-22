package davidch.leetcode.challenges.n21;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        final var beforeHead = new ListNode(0);
        var current = beforeHead;

        while (list1 != null || list2 != null) {
            if (list1 == null || (list2 != null && list2.val <= list1.val)) {
                var tmp = list1;
                list1 = list2;
                list2 = tmp;
            }

            current.next = list1;
            list1 = list1.next;
            current = current.next;
            current.next = null;
        }

        return beforeHead.next;
    }
}
