package davidch.leetcode.challenges.n409;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.longestPalindrome("abccccdd");
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final var result = solution.longestPalindrome("a");
        assertThat(result).isEqualTo(1);
    }
}