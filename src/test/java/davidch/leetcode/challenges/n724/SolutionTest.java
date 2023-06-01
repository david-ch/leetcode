package davidch.leetcode.challenges.n724;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 7, 3, 6, 5, 6};
        final var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3};
        final var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final int[] nums = {2, 1, -1};
        final var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(0);
    }
}