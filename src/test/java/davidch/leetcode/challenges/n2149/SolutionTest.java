package davidch.leetcode.challenges.n2149;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 1, -2, -5, 2, -4};
        final var result = solution.rearrangeArray(nums);

        final int[] expectedResult = {3, -2, 1, -5, 2, -4};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {-1, 1};
        final var result = solution.rearrangeArray(nums);

        final int[] expectedResult = {1, -1};
        assertThat(result).isEqualTo(expectedResult);
    }
}