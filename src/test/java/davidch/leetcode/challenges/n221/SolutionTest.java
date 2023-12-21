package davidch.leetcode.challenges.n221;

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
        final var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final char[][] matrix = {
                {'0', '1'},
                {'1', '0'}
        };
        final var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final char[][] matrix = {{'0'}};
        final var result = solution.maximalSquare(matrix);
        assertThat(result).isEqualTo(0);
    }
}