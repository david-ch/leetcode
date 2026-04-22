package davidch.leetcode.challenges.n1019;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var input = linkedList(2, 1, 5);
        final var result = solution.nextLargerNodes(input);
        assertThat(result).isEqualTo(new int[]{5, 5, 0});
    }

    @Test
    void example_2() {
        final var input = linkedList(2, 7, 4, 3, 5);
        final var result = solution.nextLargerNodes(input);
        assertThat(result).isEqualTo(new int[]{7, 0, 5, 5, 0});
    }
}