package davidch.leetcode.challenges.n382;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void example_1() {
        final var solution = new Solution(linkedList(1, 2, 3));
        assertThat(solution.getRandom()).isBetween(1, 3);
    }
}