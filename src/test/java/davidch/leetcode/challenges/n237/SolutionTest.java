package davidch.leetcode.challenges.n237;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(4, 5, 1, 9);
        solution.deleteNode(head.next);
        assertThat(head).isEqualTo(linkedList(4, 1, 9));
    }

    @Test
    void example_2() {
        final var head = linkedList(4, 5, 1, 9);
        solution.deleteNode(head.next.next);
        assertThat(head).isEqualTo(linkedList(4, 5, 9));
    }
}