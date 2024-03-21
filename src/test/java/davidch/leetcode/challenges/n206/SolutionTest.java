package davidch.leetcode.challenges.n206;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, 3, 4, 5);
        final var result = solution.reverseList(head);
        assertThat(result).isEqualTo(linkedList(5, 4, 3, 2, 1));
    }

    @Test
    void example_2() {
        final var head = linkedList(1, 2);
        final var result = solution.reverseList(head);
        assertThat(result).isEqualTo(linkedList(2, 1));
    }

    @Test
    void example_3() {
        final var result = solution.reverseList(null);
        assertThat(result).isNull();
    }
}