package davidch.leetcode.challenges.n1721;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, 3, 4, 5);
        final var result = solution.swapNodes(head, 2);
        assertThat(result).isEqualTo(linkedList(1, 4, 3, 2, 5));
    }

    @Test
    void example_2() {
        final var head = linkedList(7, 9, 6, 6, 7, 8, 3, 0, 9, 5);
        final var result = solution.swapNodes(head, 5);
        assertThat(result).isEqualTo(linkedList(7, 9, 6, 6, 8, 7, 3, 0, 9, 5));
    }
}