package davidch.leetcode.challenges.n203;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 6, 3, 4, 5, 6);
        final var expected = linkedList(1, 2, 3, 4, 5);
        final var result = solution.removeElements(list, 6);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final var result = solution.removeElements(null, 6);
        assertThat(result).isNull();
    }

    @Test
    void example_3() {
        final var list = linkedList(7, 7, 7, 7);
        final var result = solution.removeElements(list, 7);
        assertThat(result).isNull();
    }
}