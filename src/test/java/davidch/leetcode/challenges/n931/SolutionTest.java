package davidch.leetcode.challenges.n931;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        final var result = solution.minFallingPathSum(matrix);
        assertThat(result).isEqualTo(13);
    }

    @Test
    void example_2() {
        final int[][] matrix = {
                {-19, 57},
                {-40, -5}
        };
        final var result = solution.minFallingPathSum(matrix);
        assertThat(result).isEqualTo(-59);
    }

    @Test
    void example_3() {
        final int[][] matrix = {
                {17, 82},
                {1, -44}
        };
        final var result = solution.minFallingPathSum(matrix);
        assertThat(result).isEqualTo(-27);
    }
}