package davidch.leetcode.challenges.n328;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 3, 4, 5);
        final var expected = linkedList(1, 3, 5, 2, 4);
        final var result = solution.oddEvenList(list);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final var list = linkedList(2, 1, 3, 5, 6, 4, 7);
        final var expected = linkedList(2, 3, 6, 7, 1, 5, 4);
        final var result = solution.oddEvenList(list);
        assertThat(result).isEqualTo(expected);
    }
}