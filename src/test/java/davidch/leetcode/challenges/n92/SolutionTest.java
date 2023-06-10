package davidch.leetcode.challenges.n92;


import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 3, 4, 5);
        final var result = solution.reverseBetween(list, 2, 4);

        assertThat(result).isEqualTo(linkedList(1, 4, 3, 2, 5));
    }

    @Test
    void example_2() {
        final var list = linkedList(5);
        final var result = solution.reverseBetween(list, 1, 1);

        assertThat(result).isEqualTo(linkedList(5));
    }

    @Test
    void example_3() {
        final var list = linkedList(1, 2, 3, 4, 5);
        final var result = solution.reverseBetween(list, 1, 4);

        assertThat(result).isEqualTo(linkedList(4, 3, 2, 1, 5));
    }
}