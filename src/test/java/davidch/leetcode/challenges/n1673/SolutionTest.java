package davidch.leetcode.challenges.n1673;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 5, 2, 6};
        final int[] expectedResult = {2, 6};
        final var result = solution.mostCompetitive(nums, 2);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 4, 3, 3, 5, 4, 9, 6};
        final int[] expectedResult = {2, 3, 3, 4};
        final var result = solution.mostCompetitive(nums, 4);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {71, 18, 52, 29, 55, 73, 24, 42, 66, 8, 80, 2};
        final int[] expectedResult = {8, 80, 2};
        final var result = solution.mostCompetitive(nums, 3);
        assertThat(result).isEqualTo(expectedResult);
    }
}