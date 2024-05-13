package davidch.leetcode.challenges.n861;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
            {0, 0, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 0}
        };
        final var result = solution.matrixScore(grid);
        assertThat(result).isEqualTo(39);
    }

    @Test
    void example_2() {
        final int[][] grid = {{0}};
        final var result = solution.matrixScore(grid);
        assertThat(result).isEqualTo(1);
    }
}