package davidch.leetcode.challenges.n201;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final var result = solution.rangeBitwiseAnd(5, 7);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final var result = solution.rangeBitwiseAnd(0, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final var result = solution.rangeBitwiseAnd(1, 2147483647);
        assertThat(result).isEqualTo(0);
    }
}