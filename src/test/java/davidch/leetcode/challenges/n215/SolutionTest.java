package davidch.leetcode.challenges.n215;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 2, 1, 5, 6, 4};
        final var result = solution.findKthLargest(nums, 2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        final var result = solution.findKthLargest(nums, 4);
        assertThat(result).isEqualTo(4);
    }
}