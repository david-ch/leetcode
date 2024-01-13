package davidch.leetcode.challenges.n416;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 5, 11, 5};
        final var result = solution.canPartition(nums);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3, 5};
        final var result = solution.canPartition(nums);
        assertThat(result).isFalse();
    }
}