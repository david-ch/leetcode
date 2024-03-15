package davidch.leetcode.challenges.n238;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4};
        final var result = solution.productExceptSelf(nums);

        final int[] expectedResult = {24, 12, 8, 6};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] nums = {-1, 1, 0, -3, 3};
        final var result = solution.productExceptSelf(nums);

        final int[] expectedResult = {0, 0, 9, 0, 0};
        assertThat(result).isEqualTo(expectedResult);
    }
}