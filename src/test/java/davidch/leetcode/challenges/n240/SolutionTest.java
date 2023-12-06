package davidch.leetcode.challenges.n240;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        final var result = solution.searchMatrix(matrix, 5);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        final var result = solution.searchMatrix(matrix, 20);
        assertThat(result).isFalse();
    }

    @Test
    void example_3() {
        final int[][] matrix = {{-5}};
        final var result = solution.searchMatrix(matrix, -5);
        assertThat(result).isTrue();
    }
}