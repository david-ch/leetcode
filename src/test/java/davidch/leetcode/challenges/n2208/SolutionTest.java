package davidch.leetcode.challenges.n2208;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {5, 19, 8, 1};
        final var result = solution.halveArray(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {3, 8, 20};
        final var result = solution.halveArray(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_3() {
        final int[] nums = {32, 98, 23, 14, 67, 40, 26, 9, 96, 96, 91, 76, 4, 40, 42, 2, 31, 13, 16, 37, 62, 2, 27, 25, 100, 94, 14, 3, 48, 56, 64, 59, 33, 10, 74, 47, 73, 72, 89, 69, 15, 79, 22, 18, 53, 62, 20, 9, 76, 64};
        final var result = solution.halveArray(nums);
        assertThat(result).isEqualTo(36);
    }
}