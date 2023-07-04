package davidch.leetcode.challenges.n2;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var l1 = linkedList(2, 4, 3);
        final var l2 = linkedList(5, 6, 4);
        final var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(linkedList(7, 0, 8));
    }

    @Test
    void example_2() {
        final var l1 = linkedList(0);
        final var l2 = linkedList(0);
        final var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(linkedList(0));
    }

    @Test
    void example_3() {
        final var l1 = linkedList(9, 9, 9, 9, 9, 9, 9);
        final var l2 = linkedList(9, 9, 9, 9);
        final var result = solution.addTwoNumbers(l1, l2);
        assertThat(result).isEqualTo(linkedList(8, 9, 9, 9, 0, 0, 0, 1));
    }
}