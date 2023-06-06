package davidch.leetcode.challenges.n24;


import davidch.leetcode.challenges.n24.Solution.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = linkedList(1, 2, 3, 4);

        final var result = solution.swapPairs(head);

        final var expected = linkedList(2, 1, 4, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        final var result = solution.swapPairs(null);

        assertThat(result).isNull();
    }

    @Test
    void example_3() {
        final var head = linkedList(1);

        final var result = solution.swapPairs(head);

        final var expected = linkedList(1);
        assertThat(result).isEqualTo(expected);
    }

    private static ListNode linkedList(int... values) {
        assert values.length > 0;

        final var head = new ListNode(values[0]);
        var current = head;
        for (var i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}