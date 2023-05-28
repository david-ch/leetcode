package davidch.leetcode.challenges.n209;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 3, 1, 2, 4, 3};
        final var result = solution.minSubArrayLen(7, nums);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 4, 4};
        final var result = solution.minSubArrayLen(4, nums);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_3() {
        final int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        final var result = solution.minSubArrayLen(11, nums);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final int[] nums = {1, 2, 3, 4, 5};
        final var result = solution.minSubArrayLen(11, nums);

        assertThat(result).isEqualTo(3);
    }
}