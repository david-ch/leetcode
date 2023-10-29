package davidch.leetcode.challenges.n908;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1};
        final var result = solution.smallestRangeI(nums, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 10};
        final var result = solution.smallestRangeI(nums, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 3, 6};
        final var result = solution.smallestRangeI(nums, 3);
        assertThat(result).isEqualTo(0);
    }
}