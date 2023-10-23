package davidch.leetcode.challenges.n2462;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        final var result = solution.totalCost(costs, 3, 4);
        assertThat(result).isEqualTo(11);
    }

    @Test
    void example_2() {
        final int[] costs = {1, 2, 4, 1};
        final var result = solution.totalCost(costs, 3, 3);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_3() {
        final int[] costs = {2, 2, 1, 1, 1};
        final var result = solution.totalCost(costs, 5, 3);
        assertThat(result).isEqualTo(7);
    }
}