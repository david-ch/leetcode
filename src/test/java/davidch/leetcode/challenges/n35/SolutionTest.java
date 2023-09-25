package davidch.leetcode.challenges.n35;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3, 5, 6};
        final var result = solution.searchInsert(nums, 5);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 3, 5, 6};
        final var result = solution.searchInsert(nums, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 3, 5, 6};
        final var result = solution.searchInsert(nums, 7);
        assertThat(result).isEqualTo(4);
    }
}