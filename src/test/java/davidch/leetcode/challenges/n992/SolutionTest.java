package davidch.leetcode.challenges.n992;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 1, 2, 3};
        final var result = solution.subarraysWithKDistinct(nums, 2);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 1, 3, 4};
        final var result = solution.subarraysWithKDistinct(nums, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 2, 1, 2};
        final var result = solution.subarraysWithKDistinct(nums, 3);
        assertThat(result).isEqualTo(0);
    }
}