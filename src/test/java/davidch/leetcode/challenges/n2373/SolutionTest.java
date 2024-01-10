package davidch.leetcode.challenges.n2373;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2}
        };
        final int[][] expectedResult = {
                {9, 9},
                {8, 6}
        };
        final var result = solution.largestLocal(grid);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
        };
        final int[][] expectedResult = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2},
        };
        final var result = solution.largestLocal(grid);
        assertThat(result).isEqualTo(expectedResult);
    }
}