package davidch.leetcode.challenges.n143;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, 3, 4);
        solution.reorderList(head);
        assertThat(head).isEqualTo(linkedList(1, 4, 2, 3));
    }

    @Test
    void example_2() {
        final var head = linkedList(1, 2, 3, 4, 5);
        solution.reorderList(head);
        assertThat(head).isEqualTo(linkedList(1, 5, 2, 4, 3));
    }

    @Test
    void example_3() {
        final var head = linkedList(1, 2, 3, 4, 5, 6);
        solution.reorderList(head);
        assertThat(head).isEqualTo(linkedList(1, 6, 2, 5, 3, 4));
    }
}