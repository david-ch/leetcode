package davidch.leetcode.challenges.n67;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var a = "11";
        final var b = "1";
        final var result = solution.addBinary(a, b);
        assertThat(result).isEqualTo("100");
    }

    @Test
    void example_2() {
        final var a = "1010";
        final var b = "1011";
        final var result = solution.addBinary(a, b);
        assertThat(result).isEqualTo("10101");
    }

    @Test
    void example_3() {
        final var a = "0";
        final var b = "0";
        final var result = solution.addBinary(a, b);
        assertThat(result).isEqualTo("0");
    }
}