package davidch.leetcode.challenges.n121;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] prices = {7, 1, 5, 3, 6, 4};
        final var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_2() {
        final int[] prices = {7, 6, 4, 3, 1};
        final var result = solution.maxProfit(prices);
        assertThat(result).isEqualTo(0);
    }
}