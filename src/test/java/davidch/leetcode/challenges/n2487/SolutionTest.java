package davidch.leetcode.challenges.n2487;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.removeNodes(linkedList(5, 2, 13, 3, 8));
        assertThat(result).isEqualTo(linkedList(13, 8));
    }

    @Test
    void example_2() {
        final var result = solution.removeNodes(linkedList(1, 1, 1, 1));
        assertThat(result).isEqualTo(linkedList(1, 1, 1, 1));
    }
}