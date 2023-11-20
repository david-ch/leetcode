package davidch.leetcode.challenges.n2384;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.largestPalindromic("444947137");
        assertThat(result).isEqualTo("7449447");
    }

    @Test
    void example_2() {
        final var result = solution.largestPalindromic("00009");
        assertThat(result).isEqualTo("9");
    }

    @Test
    void example_3() {
        final var result = solution.largestPalindromic("00000");
        assertThat(result).isEqualTo("0");
    }

    @Test
    void example_4() {
        final var result = solution.largestPalindromic("00011");
        assertThat(result).isEqualTo("10001");
    }
}