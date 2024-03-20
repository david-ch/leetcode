package davidch.leetcode.challenges.n1669;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list1 = linkedList(10, 1, 13, 6, 9, 5);
        final var list2 = linkedList(1000000, 1000001, 1000002);
        final var result = solution.mergeInBetween(list1, 3, 4, list2);
        assertThat(result).isEqualTo(linkedList(10, 1, 13, 1000000, 1000001, 1000002, 5));
    }

    @Test
    void example_2() {
        final var list1 = linkedList(0, 1, 2, 3, 4, 5, 6);
        final var list2 = linkedList(1000000, 1000001, 1000002, 1000003, 1000004);
        final var result = solution.mergeInBetween(list1, 2, 5, list2);
        assertThat(result).isEqualTo(linkedList(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6));
    }

    @Test
    void example_3() {
        final var list1 = linkedList(10, 1, 13, 6, 9, 5);
        final var list2 = linkedList(1000000, 1000001, 1000002);
        final var result = solution.mergeInBetween(list1, 3, 4, list2);
        assertThat(result).isEqualTo(linkedList(10, 1, 13, 1000000, 1000001, 1000002, 5));
    }
}