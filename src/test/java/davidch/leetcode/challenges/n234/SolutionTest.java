package davidch.leetcode.challenges.n234;

import org.junit.jupiter.api.Test;

import static davidch.leetcode.challenges.common.linkedlist.ListNode.linkedList;
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
}