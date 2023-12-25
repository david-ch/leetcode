package davidch.leetcode.challenges.n91;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.numDecodings("12");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final var result = solution.numDecodings("226");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final var result = solution.numDecodings("06");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final var result = solution.numDecodings("0");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_5() {
        final var result = solution.numDecodings("27");
        assertThat(result).isEqualTo(1);
    }
}