package davidch.leetcode.challenges.n66;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] digits = {1, 2, 3};
        final int[] expectedResult = {1, 2, 4};
        final var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] digits = {4, 3, 2, 1};
        final int[] expectedResult = {4, 3, 2, 2};
        final var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] digits = {9};
        final int[] expectedResult = {1, 0};
        final var result = solution.plusOne(digits);
        assertThat(result).isEqualTo(expectedResult);
    }
}