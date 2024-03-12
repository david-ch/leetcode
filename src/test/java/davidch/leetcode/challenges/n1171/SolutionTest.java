package davidch.leetcode.challenges.n1171;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, -3, 3, 1);
        final var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(linkedList(3, 1));
    }

    @Test
    void example_2() {
        final var head = linkedList(1, 2, 3, -3, 4);
        final var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(linkedList(1, 2, 4));
    }

    @Test
    void example_3() {
        final var head = linkedList(1, 2, 3, -3, -2);
        final var result = solution.removeZeroSumSublists(head);
        assertThat(result).isEqualTo(linkedList(1));
    }

    @Test
    void example_4() {
        final var head = linkedList(1, 3, 1, 2, -3, -4);
        final var result = solution.removeZeroSumSublists(head);
        assertThat(result).isNull();
    }

    @Test
    void example_5() {
        final var head = linkedList(0);
        final var result = solution.removeZeroSumSublists(head);
        assertThat(result).isNull();
    }
}