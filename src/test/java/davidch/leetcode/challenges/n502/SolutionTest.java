package davidch.leetcode.challenges.n502;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] profits = {1, 2, 3};
        final int[] capital = {0, 1, 1};
        final var result = solution.findMaximizedCapital(2, 0, profits, capital);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] profits = {1, 2, 3};
        final int[] capital = {0, 1, 2};
        final var result = solution.findMaximizedCapital(3, 0, profits, capital);
        assertThat(result).isEqualTo(6);
    }
}