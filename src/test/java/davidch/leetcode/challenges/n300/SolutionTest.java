package davidch.leetcode.challenges.n300;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        final var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1, 0, 3, 2, 3};
        final var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[] nums = {7, 7, 7, 7, 7, 7, 7};
        final var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_4() {
        final int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        final var result = solution.lengthOfLIS(nums);
        assertThat(result).isEqualTo(6);
    }
}