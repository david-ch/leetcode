package davidch.leetcode.challenges.n2966;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        final var result = solution.divideArray(nums, 2);

        final int[][] expectedResult = {
                {1, 1, 3},
                {3, 4, 5},
                {7, 8, 9}
        };
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 3, 3, 2, 7, 3};
        final var result = solution.divideArray(nums, 3);

        final int[][] expectedResult = {};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {33, 26, 4, 18, 16, 24, 24, 15, 8, 18, 34, 20, 24, 16, 3};
        final var result = solution.divideArray(nums, 16);

        final int[][] expectedResult = {
                {3, 4, 8},
                {15, 16, 16},
                {18, 18, 20},
                {24, 24, 24},
                {26, 33, 34}
        };
        assertThat(result).isEqualTo(expectedResult);
    }
}