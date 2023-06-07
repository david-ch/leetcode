package davidch.leetcode.challenges.n2095;

import davidch.leetcode.challenges.n2095.Solution.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.deleteMiddle(linkedList(1, 3, 4, 7, 1, 2, 6));
        assertThat(result).isEqualTo(linkedList(1, 3, 4, 1, 2, 6));
    }

    @Test
    void example_2() {
        final var result = solution.deleteMiddle(linkedList(1, 2, 3, 4));
        assertThat(result).isEqualTo(linkedList(1, 2, 4));
    }

    @Test
    void example_3() {
        final var result = solution.deleteMiddle(linkedList(2, 1));
        assertThat(result).isEqualTo(linkedList(2));
    }

    @Test
    void example_4() {
        final var result = solution.deleteMiddle(linkedList(2));
        assertThat(result).isEqualTo(null);
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