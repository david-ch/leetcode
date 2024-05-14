package davidch.leetcode.challenges.n1219;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
            {0, 6, 0},
            {5, 8, 7},
            {0, 9, 0}
        };
        final var result = solution.getMaximumGold(grid);
        assertThat(result).isEqualTo(24);
    }

    @Test
    void example_2() {
        final int[][] grid = {
            {1, 0, 7},
            {2, 0, 6},
            {3, 4, 5},
            {0, 3, 0},
            {9, 0, 20}
        };
        final var result = solution.getMaximumGold(grid);
        assertThat(result).isEqualTo(28);
    }
}