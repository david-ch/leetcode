package davidch.leetcode.challenges.n2441;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {-1, 2, -3, 3};
        final var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {-1, 10, 6, 7, -7, 1};
        final var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_3() {
        final int[] nums = {-10, 8, 6, 7, -2, -3};
        final var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_4() {
        final int[] nums = {-30, 34, 1, 32, 26, -9, -30, 22, -49, 29, 48, 47, 38, 4, 43, 12, -1, -8, 11, -37, 32, 40, 9, 15, -34, -34, -16, -5, 26, -44, -36, -13, -16, 10, 39, -17, -22, 17, -16};
        final var result = solution.findMaxK(nums);
        assertThat(result).isEqualTo(34);
    }
}