package davidch.leetcode.challenges.n494;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 1, 1, 1};
        final var result = solution.findTargetSumWays(nums, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final int[] nums = {1};
        final var result = solution.findTargetSumWays(nums, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 0};
        final var result = solution.findTargetSumWays(nums, 1);
        assertThat(result).isEqualTo(2);
    }
}