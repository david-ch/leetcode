package davidch.leetcode.challenges.n141;

import davidch.leetcode.challenges.common.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(3, 2, 0, -4);
        head.next.next.next.next = head.next;

        final var result = solution.hasCycle(head);

        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var head = new ListNode(1);
        head.next = new ListNode(2);

        head.next.next = head;

        final var result = solution.hasCycle(head);

        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final var head = new ListNode(1);

        final var result = solution.hasCycle(head);

        assertThat(result).isFalse();
    }
}