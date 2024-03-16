package davidch.leetcode.challenges.n525;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {0, 1};
        final var result = solution.findMaxLength(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1, 0};
        final var result = solution.findMaxLength(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {0, 0, 0, 1, 0};
        final var result = solution.findMaxLength(nums);
        assertThat(result).isEqualTo(2);
    }
}