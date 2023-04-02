package davidch.leetcode.challenges.n608;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.validPalindrome("aba");

        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final var result = solution.validPalindrome("abca");

        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final var result = solution.validPalindrome("abc");

        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final var result = solution.validPalindrome("abcbda");

        assertThat(result).isTrue();
    }

    @Test
    void example_5() {
        final var result = solution.validPalindrome("adbcba");

        assertThat(result).isTrue();
    }
}