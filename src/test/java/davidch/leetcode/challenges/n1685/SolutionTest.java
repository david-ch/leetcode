package davidch.leetcode.challenges.n1685;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 3, 5};
        final int[] expectedResult = {4, 3, 5};
        final var result = solution.getSumAbsoluteDifferences(nums);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 4, 6, 8, 10};
        final int[] expectedResult = {24, 15, 13, 15, 21};
        final var result = solution.getSumAbsoluteDifferences(nums);
        assertThat(result).isEqualTo(expectedResult);
    }
}