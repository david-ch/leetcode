package davidch.leetcode.challenges.n83;

import davidch.leetcode.challenges.n83.Solution.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var head = asLinkedList(new int[]{1, 1, 2});

        final var result = solution.deleteDuplicates(head);

        final var expected = asLinkedList(new int[]{1, 2});
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void example_2() {
        final var head = asLinkedList(new int[]{1, 1, 2, 3, 3});

        final var result = solution.deleteDuplicates(head);

        final var expected = asLinkedList(new int[]{1, 2, 3});
        assertThat(result).isEqualTo(expected);
    }

    private ListNode asLinkedList(int[] values) {
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