package davidch.leetcode.challenges.n645;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 2, 4};
        final int[] expectedResult = {2, 3};
        final var result = solution.findErrorNums(nums);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 1};
        final int[] expectedResult = {1, 2};
        final var result = solution.findErrorNums(nums);
        assertThat(result).isEqualTo(expectedResult);
    }
}