package davidch.leetcode.challenges.n598;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] ops = {
                {2, 2},
                {3, 3}
        };
        final var result = solution.maxCount(3, 3, ops);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[][] ops = {
                {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}
        };
        final var result = solution.maxCount(3, 3, ops);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[][] ops = {};
        final var result = solution.maxCount(3, 3, ops);
        assertThat(result).isEqualTo(9);
    }
}