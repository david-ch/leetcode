package davidch.leetcode.challenges.n3005;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 2, 3, 1, 4};
        final var result = solution.maxFrequencyElements(nums);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 2, 3, 4, 5};
        final var result = solution.maxFrequencyElements(nums);
        assertThat(result).isEqualTo(5);
    }
}