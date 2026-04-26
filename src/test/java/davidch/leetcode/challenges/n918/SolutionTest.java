package davidch.leetcode.challenges.n918;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, -2, 3, -2};
        final var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {5, -3, 5};
        final var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_3() {
        final int[] nums = {-3, -2, -3};
        final var result = solution.maxSubarraySumCircular(nums);
        assertThat(result).isEqualTo(-2);
    }
}