package davidch.leetcode.challenges.n1004;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};

        final var result = solution.longestOnes(nums, 2);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void example_2() {
        final int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};

        final var result = solution.longestOnes(nums, 3);

        assertThat(result).isEqualTo(10);
    }

    @Test
    void example_3() {
        final int[] nums = {0, 0, 0, 1};

        final var result = solution.longestOnes(nums, 4);

        assertThat(result).isEqualTo(4);
    }
}