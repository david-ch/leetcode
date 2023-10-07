package davidch.leetcode.challenges.n994;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        final var result = solution.orangesRotting(grid);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        final var result = solution.orangesRotting(grid);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final int[][] grid = {{0, 2}};
        final var result = solution.orangesRotting(grid);
        assertThat(result).isEqualTo(0);
    }
}