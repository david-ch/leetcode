package davidch.leetcode.challenges.n7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.reverse(123);
        assertThat(result).isEqualTo(321);
    }

    @Test
    void example_2() {
        final var result = solution.reverse(-123);
        assertThat(result).isEqualTo(-321);
    }

    @Test
    void example_3() {
        final var result = solution.reverse(120);
        assertThat(result).isEqualTo(21);
    }

    @Test
    void integer_overflow() {
        final var result = solution.reverse(1534236469);
        assertThat(result).isEqualTo(0);
    }
}