package davidch.leetcode.challenges.n463;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        final var result = solution.islandPerimeter(grid);
        assertThat(result).isEqualTo(16);
    }

    @Test
    void example_2() {
        final int[][] grid = {{1}};

        final var result = solution.islandPerimeter(grid);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[][] grid = {{1, 0}};

        final var result = solution.islandPerimeter(grid);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_4() {
        final int[][] grid = {{0, 1}};

        final var result = solution.islandPerimeter(grid);
        assertThat(result).isEqualTo(4);
    }
}