package davidch.leetcode.challenges.n377;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3};
        final var result = solution.combinationSum4(nums, 4);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final int[] nums = {9};
        final var result = solution.combinationSum4(nums, 3);
        assertThat(result).isEqualTo(0);
    }
}