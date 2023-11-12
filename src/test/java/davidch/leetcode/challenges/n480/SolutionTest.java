package davidch.leetcode.challenges.n480;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        final double[] expectedResult = {1., -1., -1., 3., 5., 6.};
        final var result = solution.medianSlidingWindow(nums, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3, 4, 2, 3, 1, 4, 2};
        final double[] expectedResult = {2., 3., 3., 3., 2., 3., 2.};
        final var result = solution.medianSlidingWindow(nums, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] nums = {2147483647, 2147483647};
        final double[] expectedResult = {2147483647.};
        final var result = solution.medianSlidingWindow(nums, 2);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_4() {
        final int[] nums = {-2147483648, -2147483648, 2147483647, -2147483648, -2147483648, -2147483648, 2147483647, 2147483647, 2147483647, 2147483647, -2147483648, 2147483647, -2147483648};
        final double[] expectedResult = {-2147483648., -2147483648., -2147483648., -2147483648., -2147483648., 2147483647., 2147483647., 2147483647., 2147483647., 2147483647., -2147483648.};
        final var result = solution.medianSlidingWindow(nums, 3);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_5() {
        final int[] nums = {1, 2};
        final double[] expectedResult = {1., 2.};
        final var result = solution.medianSlidingWindow(nums, 1);
        assertThat(result).isEqualTo(expectedResult);
    }
}