package davidch.leetcode.challenges.n2962;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 2, 3, 3};
        final var result = solution.countSubarrays(nums, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 4, 2, 1};
        final var result = solution.countSubarrays(nums, 3);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] nums = {28, 5, 58, 91, 24, 91, 53, 9, 48, 85, 16, 70, 91, 91, 47, 91, 61, 4, 54, 61, 49};
        final var result = solution.countSubarrays(nums, 1);
        assertThat(result).isEqualTo(187);
    }
}