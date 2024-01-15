package davidch.leetcode.challenges.n2917;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {7, 12, 9, 8, 9, 15};
        final var result = solution.findKOr(nums, 4);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 12, 1, 11, 4, 5};
        final var result = solution.findKOr(nums, 6);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] nums = {10, 8, 5, 9, 11, 6, 8};
        final var result = solution.findKOr(nums, 1);
        assertThat(result).isEqualTo(15);
    }
}