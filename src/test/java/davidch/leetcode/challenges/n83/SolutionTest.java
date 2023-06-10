package davidch.leetcode.challenges.n83;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 1, 2);

        final var result = solution.deleteDuplicates(head);

        final var expected = linkedList(1, 2);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void example_2() {
        final var head = linkedList(1, 1, 2, 3, 3);

        final var result = solution.deleteDuplicates(head);

        final var expected = linkedList(1, 2, 3);
        assertThat(result).isEqualTo(expected);
    }
}