package davidch.leetcode.challenges.n82;


import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 3, 3, 4, 4, 5);
        final var result = solution.deleteDuplicates(list);
        assertThat(result).isEqualTo(linkedList(1, 2, 5));
    }

    @Test
    void example_2() {
        final var list = linkedList(1, 1, 1, 2, 3);
        final var result = solution.deleteDuplicates(list);
        assertThat(result).isEqualTo(linkedList(2, 3));
    }

    @Test
    void should_return_null_if_list_contains_of_duplicated_values_only() {
        final var list = linkedList(1,1);
        final var result = solution.deleteDuplicates(list);
        assertThat(result).isEqualTo(null);
    }

    @Test
    void should_return_null_if_input_is_null() {
        final var result = solution.deleteDuplicates(null);
        assertThat(result).isEqualTo(null);
    }
}