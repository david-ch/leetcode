package davidch.leetcode.challenges.n1391;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();
    
    @Test
    void example_1() {
        final int[][] grid = {
            {2, 4, 3},
            {6, 5, 2}
        };
        final var result = solution.hasValidPath(grid);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[][] grid = {
            {1, 2, 1},
            {1, 2, 1}
        };
        final var result = solution.hasValidPath(grid);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[][] grid = {{1,1,2}};
        final var result = solution.hasValidPath(grid);
        assertThat(result).isFalse();
    }

    @Test
    void example_4() {
        final int[][] grid = {
            {4, 3, 3},
            {6, 5, 2}
        };
        final var result = solution.hasValidPath(grid);
        assertThat(result).isFalse();
    }

    @Test
    void example_5() {
        final int[][] grid = {
            {6, 1, 3},
            {4, 1, 5}
        };
        final var result = solution.hasValidPath(grid);
        assertThat(result).isTrue();
    }
}