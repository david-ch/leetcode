package davidch.leetcode.challenges.n1695;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {4, 2, 4, 5, 6};
        final var result = solution.maximumUniqueSubarray(nums);
        assertThat(result).isEqualTo(17);
    }

    @Test
    void example_2() {
        final int[] nums = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        final var result = solution.maximumUniqueSubarray(nums);
        assertThat(result).isEqualTo(8);
    }
}