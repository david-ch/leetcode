package davidch.leetcode.challenges.n1289;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        final var result = solution.minFallingPathSum(grid);
        assertThat(result).isEqualTo(13);
    }

    @Test
    void example_2() {
        final int[][] grid = {{7}};
        final var result = solution.minFallingPathSum(grid);
        assertThat(result).isEqualTo(7);
    }
}