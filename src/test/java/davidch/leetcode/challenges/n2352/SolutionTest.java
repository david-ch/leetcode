package davidch.leetcode.challenges.n2352;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        final var result = solution.equalPairs(grid);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        final var result = solution.equalPairs(grid);
        assertThat(result).isEqualTo(3);
    }
}