package davidch.leetcode.challenges.n239;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        final int[] expectedResult = {3, 3, 5, 5, 6, 7};
        final var result = solution.maxSlidingWindow(nums, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {1};
        final int[] expectedResult = {1};
        final var result = solution.maxSlidingWindow(nums, 1);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        final int[] expectedResult = {3, 3, -1, 5, 5, 6, 7};
        final var result = solution.maxSlidingWindow(nums, 2);
        assertThat(result).isEqualTo(expectedResult);
    }
}