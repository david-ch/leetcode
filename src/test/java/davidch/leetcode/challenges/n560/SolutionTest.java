package davidch.leetcode.challenges.n560;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 1};
        final var result = solution.subarraySum(nums, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3};
        final var result = solution.subarraySum(nums, 3);
        assertThat(result).isEqualTo(2);
    }
}