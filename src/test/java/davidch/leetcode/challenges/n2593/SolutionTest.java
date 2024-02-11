package davidch.leetcode.challenges.n2593;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {2, 1, 3, 4, 5, 2};
        final var result = solution.findScore(nums);
        assertThat(result).isEqualTo(7);
    }

    @Test
    void example_2() {
        final int[] nums = {2, 3, 5, 1, 3, 2};
        final var result = solution.findScore(nums);
        assertThat(result).isEqualTo(5);
    }
}