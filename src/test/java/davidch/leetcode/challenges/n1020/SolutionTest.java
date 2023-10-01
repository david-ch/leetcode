package davidch.leetcode.challenges.n1020;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        final var result = solution.numEnclaves(grid);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        final var result = solution.numEnclaves(grid);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[][] grid = {
                {0},
                {1},
                {1},
                {0},
                {0}
        };
        final var result = solution.numEnclaves(grid);
        assertThat(result).isEqualTo(0);
    }
}