package davidch.leetcode.challenges.n1208;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var s = "abcd";
        final var t = "bcdf";
        final var maxCost = 3;

        final var result = solution.equalSubstring(s, t, maxCost);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final var s = "abcd";
        final var t = "cdef";
        final var maxCost = 3;

        final var result = solution.equalSubstring(s, t, maxCost);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final var s = "abcd";
        final var t = "acde";
        final var maxCost = 0;

        final var result = solution.equalSubstring(s, t, maxCost);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_4() {
        final var s = "krrgw";
        final var t = "zjxss";
        final var maxCost = 19;

        final var result = solution.equalSubstring(s, t, maxCost);

        assertThat(result).isEqualTo(2);
    }
}