package davidch.leetcode.challenges.n85;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        final var result = solution.maximalRectangle(matrix);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final char[][] matrix = {
            {'0'}
        };
        final var result = solution.maximalRectangle(matrix);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final char[][] matrix = {
            {'1'}
        };
        final var result = solution.maximalRectangle(matrix);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_4() {
        final char[][] matrix = {
            {'0', '0', '1', '0'},
            {'0', '0', '1', '0'},
            {'0', '0', '1', '0'},
            {'0', '0', '1', '1'},
            {'0', '1', '1', '1'},
            {'0', '1', '1', '1'},
            {'1', '1', '1', '1'}
        };
        final var result = solution.maximalRectangle(matrix);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_5() {
        final char[][] matrix = {
            {'0', '1', '1'},
            {'1', '1', '1'},
            {'1', '1', '1'}
        };
        final var result = solution.maximalRectangle(matrix);
        assertThat(result).isEqualTo(6);
    }
}