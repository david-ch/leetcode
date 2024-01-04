package davidch.leetcode.challenges.n2870;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        final var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 1, 2, 2, 3, 3};
        final var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final int[] nums = {14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
        final var result = solution.minOperations(nums);
        assertThat(result).isEqualTo(7);
    }
}