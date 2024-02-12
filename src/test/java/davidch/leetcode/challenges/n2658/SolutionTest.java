package davidch.leetcode.challenges.n2658;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {0, 2, 1, 0},
                {4, 0, 0, 3},
                {1, 0, 0, 4},
                {0, 3, 2, 0}
        };
        final var result = solution.findMaxFish(grid);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1}
        };
        final var result = solution.findMaxFish(grid);
        assertThat(result).isEqualTo(1);
    }
}