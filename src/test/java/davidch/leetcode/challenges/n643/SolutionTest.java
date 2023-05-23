package davidch.leetcode.challenges.n643;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 12, -5, -6, 50, 3};

        final var result = solution.findMaxAverage(nums, 4);

        assertThat(result).isEqualTo(12.75);
    }

    @Test
    void example_2() {
        final int[] nums = {5};

        final var result = solution.findMaxAverage(nums, 1);

        assertThat(result).isEqualTo(5.0);
    }
}