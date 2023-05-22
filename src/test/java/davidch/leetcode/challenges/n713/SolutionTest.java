package davidch.leetcode.challenges.n713;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {10, 5, 2, 6};

        final var result = solution.numSubarrayProductLessThanK(nums, 100);

        assertThat(result).isEqualTo(8);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3};

        final var result = solution.numSubarrayProductLessThanK(nums, 0);

        assertThat(result).isEqualTo(0);
    }
}