package davidch.leetcode.challenges.n2997;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 1, 3, 4};
        final var result = solution.minOperations(nums, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 0, 2, 0};
        final var result = solution.minOperations(nums, 0);
        assertThat(result).isEqualTo(0);
    }
}