package davidch.leetcode.challenges.n506;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] score = {5, 4, 3, 2, 1};
        final var result = solution.findRelativeRanks(score);
        final String[] expectedResult = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] score = {10, 3, 8, 9, 4};
        final var result = solution.findRelativeRanks(score);
        final String[] expectedResult = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assertThat(result).isEqualTo(expectedResult);
    }
}