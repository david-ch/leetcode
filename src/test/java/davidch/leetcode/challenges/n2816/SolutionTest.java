package davidch.leetcode.challenges.n2816;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.doubleIt(linkedList(1, 8, 9));
        assertThat(result).isEqualTo(linkedList(3, 7, 8));
    }

    @Test
    void example_2() {
        final var result = solution.doubleIt(linkedList(9, 9, 9));
        assertThat(result).isEqualTo(linkedList(1, 9, 9, 8));
    }
}