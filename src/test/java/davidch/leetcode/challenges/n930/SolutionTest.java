package davidch.leetcode.challenges.n930;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 0, 1, 0, 1};
        final var result = solution.numSubarraysWithSum(nums, 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 0, 0, 0, 0};
        final var result = solution.numSubarraysWithSum(nums, 0);
        assertThat(result).isEqualTo(15);
    }
}