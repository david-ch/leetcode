package davidch.leetcode.challenges.n19;


import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 3, 4, 5);
        final var result = solution.removeNthFromEnd(list, 2);
        assertThat(result).isEqualTo(linkedList(1, 2, 3, 5));
    }

    @Test
    void example_2() {
        final var list = linkedList(1);
        final var result = solution.removeNthFromEnd(list, 1);
        assertThat(result).isEqualTo(null);
    }

    @Test
    void example_3() {
        final var list = linkedList(1, 2);
        final var result = solution.removeNthFromEnd(list, 1);
        assertThat(result).isEqualTo(linkedList(1));
    }
}