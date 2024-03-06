package davidch.leetcode.challenges.n1351;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        final var result = solution.countNegatives(grid);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void example_2() {
        final int[][] grid = {
            {3, 2},
            {1, 0}
        };
        final var result = solution.countNegatives(grid);
        assertThat(result).isEqualTo(0);
    }
}