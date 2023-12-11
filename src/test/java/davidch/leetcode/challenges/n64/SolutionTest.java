package davidch.leetcode.challenges.n64;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        final var result = solution.minPathSum(grid);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        final var result = solution.minPathSum(grid);
        assertThat(result).isEqualTo(12);
    }
}