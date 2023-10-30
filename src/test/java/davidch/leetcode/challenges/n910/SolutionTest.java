package davidch.leetcode.challenges.n910;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1};
        final var result = solution.smallestRangeII(nums, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 10};
        final var result = solution.smallestRangeII(nums, 2);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 3, 6};
        final var result = solution.smallestRangeII(nums, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_4() {
        final int[] nums = {7, 8, 8};
        final var result = solution.smallestRangeII(nums, 5);
        assertThat(result).isEqualTo(1);
    }
}