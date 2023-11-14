package davidch.leetcode.challenges.n1005;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {4, 2, 3};
        final var result = solution.largestSumAfterKNegations(nums, 1);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final int[] nums = {3, -1, 0, 2};
        final var result = solution.largestSumAfterKNegations(nums, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final int[] nums = {2, -3, -1, 5, -4};
        final var result = solution.largestSumAfterKNegations(nums, 2);
        assertThat(result).isEqualTo(13);
    }

    @Test
    void k_is_more_than_negative_nums_but_is_even() {
        final int[] nums = {-3, -2, 1, 2};
        final var result = solution.largestSumAfterKNegations(nums, 2);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void k_is_more_than_negative_and_force_to_negate_first_positive() {
        final int[] nums = {-3, -2, 1, 2};
        final var result = solution.largestSumAfterKNegations(nums, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void k_is_more_than_negative_and_force_to_negate_last_negative_num_back() {
        final int[] nums = {-3, -1, 2, 2};
        final var result = solution.largestSumAfterKNegations(nums, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void k_is_more_than_array_len() {
        final int[] nums = {-4, -2, -3};
        final var result = solution.largestSumAfterKNegations(nums, 4);
        assertThat(result).isEqualTo(5);
    }
}