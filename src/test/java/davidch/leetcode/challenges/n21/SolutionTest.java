package davidch.leetcode.challenges.n21;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list1 = linkedList(1, 2, 4);
        final var list2 = linkedList(1, 3, 4);
        final var result = solution.mergeTwoLists(list1, list2);
        assertThat(result).isEqualTo(linkedList(1, 1, 2, 3, 4, 4));
    }

    @Test
    void example_2() {
        final var result = solution.mergeTwoLists(null, null);
        assertThat(result).isEqualTo(null);
    }

    @Test
    void example_3() {
        final var list2 = linkedList(0);
        final var result = solution.mergeTwoLists(null, list2);
        assertThat(result).isEqualTo(linkedList(0));
    }
}