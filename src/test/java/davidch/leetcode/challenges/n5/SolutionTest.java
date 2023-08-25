package davidch.leetcode.challenges.n5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.longestPalindrome("babad");
        assertThat(result).isEqualTo("aba");
    }

    @Test
    void example_2() {
        final var result = solution.longestPalindrome("cbbd");
        assertThat(result).isEqualTo("bb");
    }

    @Test
    void example_3() {
        final var result = solution.longestPalindrome("aba");
        assertThat(result).isEqualTo("aba");
    }
}