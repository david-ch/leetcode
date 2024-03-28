package davidch.leetcode.challenges.n2958;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        final var result = solution.maxSubarrayLength(nums, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 1, 2, 1, 2, 1, 2};
        final var result = solution.maxSubarrayLength(nums, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {5, 5, 5, 5, 5, 5, 5};
        final var result = solution.maxSubarrayLength(nums, 4);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_4() {
        final int[] nums = {1, 4, 4, 3};
        final var result = solution.maxSubarrayLength(nums, 1);
        assertThat(result).isEqualTo(2);
    }
}