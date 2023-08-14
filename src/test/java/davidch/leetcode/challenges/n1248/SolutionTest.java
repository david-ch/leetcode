package davidch.leetcode.challenges.n1248;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 2, 1, 1};
        final var result = solution.numberOfSubarrays(nums, 3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 4, 6};
        final var result = solution.numberOfSubarrays(nums, 1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        final var result = solution.numberOfSubarrays(nums, 2);
        assertThat(result).isEqualTo(16);
    }
}