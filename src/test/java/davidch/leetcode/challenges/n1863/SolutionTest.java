package davidch.leetcode.challenges.n1863;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 3};
        final var result = solution.subsetXORSum(nums);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] nums = {5, 1, 6};
        final var result = solution.subsetXORSum(nums);
        assertThat(result).isEqualTo(28);
    }

    @Test
    void example_3() {
        final int[] nums = {3, 4, 5, 6, 7, 8};
        final var result = solution.subsetXORSum(nums);
        assertThat(result).isEqualTo(480);
    }
}