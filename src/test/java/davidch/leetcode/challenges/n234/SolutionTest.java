package davidch.leetcode.challenges.n234;

import davidch.leetcode.challenges.n234.Solution.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var list = linkedList(1, 2, 2, 1);
        assertThat(solution.isPalindrome(list)).isTrue();
    }

    @Test
    void example_2() {
        final var list = linkedList(1, 2);
        assertThat(solution.isPalindrome(list)).isFalse();
    }

    @Test
    void odd_length_palindrome() {
        final var list = linkedList(1, 2, 2, 2, 1);
        assertThat(solution.isPalindrome(list)).isTrue();
    }

    @Test
    void single_element() {
        final var list = linkedList(1);
        assertThat(solution.isPalindrome(list)).isTrue();
    }

    private ListNode linkedList(int... values) {
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