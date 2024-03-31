package davidch.leetcode.challenges.n2444;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 5, 2, 7, 5};
        final var result = solution.countSubarrays(nums, 1, 5);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 1, 1, 1};
        final var result = solution.countSubarrays(nums, 1, 1);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_3() {
        final int[] nums = {2, 2, 1, 3, 2, 2};
        final var result = solution.countSubarrays(nums, 1, 3);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_4() {
        final int[] nums = {35054, 398719, 945315, 945315, 820417, 945315, 35054, 945315, 171832, 945315, 35054, 109750, 790964, 441974, 552913};
        final var result = solution.countSubarrays(nums, 35054, 945315);
        assertThat(result).isEqualTo(81);
    }
}