package davidch.leetcode.challenges.n268;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {3, 0, 1};
        final var result = solution.missingNumber(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 1};
        final var result = solution.missingNumber(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        final var result = solution.missingNumber(nums);
        assertThat(result).isEqualTo(8);
    }
}