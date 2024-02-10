package davidch.leetcode.challenges.n647;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.countSubstrings("abc");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var result = solution.countSubstrings("aaa");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final var result = solution.countSubstrings("abacaba");
        assertThat(result).isEqualTo(12);
    }
}