package davidch.leetcode.challenges.n1290;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 0, 1);
        final var result = solution.getDecimalValue(list);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final var list = linkedList(0);
        final var result = solution.getDecimalValue(list);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void head_contains_the_most_significant_bit() {
        final var list = linkedList(1, 1, 0, 1);
        final var result = solution.getDecimalValue(list);
        assertThat(result).isEqualTo(13);
    }
}