package davidch.leetcode.challenges.n9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.isPalindrome(121);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.isPalindrome(-121);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final var result = solution.isPalindrome(10);
        assertThat(result).isFalse();
    }
}