package davidch.leetcode.challenges.n2816;

import davidch.leetcode.challenges.common.linkedlist.ListNode;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        var result = doubleTail(head);
        if (result.val > 9) {
            result.val -= 10;
            result = new ListNode(1, result);
        }
        return result;
    }

    private ListNode doubleTail(ListNode head) {
        head.val += head.val;
        if (head.next != null) {
            doubleTail(head.next);
            if (head.next.val > 9) {
                head.next.val -= 10;
                head.val += 1;
            }
        }
        return head;
    }
}
