package davidch.leetcode.challenges.n746;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] cost = {10, 15, 20};
        final var result = solution.minCostClimbingStairs(cost);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void example_2() {
        final int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        final var result = solution.minCostClimbingStairs(cost);
        assertThat(result).isEqualTo(6);
    }
}