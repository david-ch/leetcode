package davidch.leetcode.challenges.n413;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3, 4};
        final var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {1};
        final var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 2, 3, 4, 6, 8};
        final var result = solution.numberOfArithmeticSlices(nums);
        assertThat(result).isEqualTo(4);
    }
}