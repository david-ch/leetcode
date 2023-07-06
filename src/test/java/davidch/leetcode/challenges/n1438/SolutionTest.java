package davidch.leetcode.challenges.n1438;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {8, 2, 4, 7};
        final var result = solution.longestSubarray(nums, 4);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {10, 1, 2, 4, 7, 2};
        final var result = solution.longestSubarray(nums, 5);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[] nums = {4, 2, 2, 2, 4, 4, 2, 2};
        final var result = solution.longestSubarray(nums, 0);
        assertThat(result).isEqualTo(3);
    }
}