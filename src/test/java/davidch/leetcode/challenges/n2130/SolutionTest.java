package davidch.leetcode.challenges.n2130;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.pairSum(linkedList(5, 4, 2, 1));
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final var result = solution.pairSum(linkedList(4, 2, 2, 3));
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_3() {
        final var result = solution.pairSum(linkedList(1, 100000));
        assertThat(result).isEqualTo(100001);
    }
}