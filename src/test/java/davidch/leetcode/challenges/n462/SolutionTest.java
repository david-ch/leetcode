package davidch.leetcode.challenges.n462;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] nums = {1, 2, 3};
        final var result = solution.minMoves2(nums);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[] nums = {1, 10, 2, 9};
        final var result = solution.minMoves2(nums);
        assertThat(result).isEqualTo(16);
    }
}