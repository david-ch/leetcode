package davidch.leetcode.challenges.n485;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 1, 0, 1, 1, 1};
        final var result = solution.findMaxConsecutiveOnes(nums);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 0, 1, 1, 0, 1};
        final var result = solution.findMaxConsecutiveOnes(nums);
        assertThat(result).isEqualTo(2);
    }
}