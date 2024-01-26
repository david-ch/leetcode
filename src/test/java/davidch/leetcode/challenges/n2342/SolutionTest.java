package davidch.leetcode.challenges.n2342;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {18, 43, 36, 13, 7};
        final var result = solution.maximumSum(nums);
        assertThat(result).isEqualTo(54);
    }

    @Test
    void example_2() {
        final int[] nums = {10, 12, 19, 14};
        final var result = solution.maximumSum(nums);
        assertThat(result).isEqualTo(-1);
    }
}