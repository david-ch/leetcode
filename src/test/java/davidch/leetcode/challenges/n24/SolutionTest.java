package davidch.leetcode.challenges.n24;


import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, 3, 4);

        final var result = solution.swapPairs(head);

        final var expected = linkedList(2, 1, 4, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final var result = solution.swapPairs(null);

        assertThat(result).isNull();
    }

    @Test
    void example_3() {
        final var head = linkedList(1);

        final var result = solution.swapPairs(head);

        final var expected = linkedList(1);
        assertThat(result).isEqualTo(expected);
    }
}