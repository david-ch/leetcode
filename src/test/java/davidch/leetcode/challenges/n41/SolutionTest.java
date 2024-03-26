package davidch.leetcode.challenges.n41;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 0};
        final var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 4, -1, 1};
        final var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {7, 8, 9, 11, 12};
        final var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_4() {
        final int[] nums = {3, 2, 1};
        final var result = solution.firstMissingPositive(nums);
        assertThat(result).isEqualTo(4);
    }
}