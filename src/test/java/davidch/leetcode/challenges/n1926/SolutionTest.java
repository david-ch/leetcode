package davidch.leetcode.challenges.n1926;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        final var result = solution.nearestExit(maze, new int[]{1, 2});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final char[][] maze = {
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };
        final var result = solution.nearestExit(maze, new int[]{1, 0});
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final char[][] maze = {{'.', '+'}};
        final var result = solution.nearestExit(maze, new int[]{0, 0});
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_4() {
        final char[][] maze = {
                {'+','.','+','+','+','+','+'},
                {'+','.','+','.','.','.','+'},
                {'+','.','+','.','+','.','+'},
                {'+','.','.','.','+','.','+'},
                {'+','+','+','+','+','.','+'}
        };
        final var result = solution.nearestExit(maze, new int[]{0, 1});
        assertThat(result).isEqualTo(12);
    }
}