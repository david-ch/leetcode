package davidch.leetcode.challenges.n2074;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(5, 2, 6, 3, 9, 1, 7, 3, 8, 4);
        final var expected = linkedList(5, 6, 2, 3, 9, 1, 4, 8, 3, 7);

        final var result = solution.reverseEvenLengthGroups(list);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final var list = linkedList(1, 1, 0, 6);
        final var expected = linkedList(1, 0, 1, 6);

        final var result = solution.reverseEvenLengthGroups(list);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        final var list = linkedList(1, 1, 0, 6, 5);
        final var expected = linkedList(1, 0, 1, 5, 6);

        final var result = solution.reverseEvenLengthGroups(list);

        assertThat(result).isEqualTo(expected);
    }
}