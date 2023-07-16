package davidch.leetcode.challenges.n1475;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] prices = {8, 4, 6, 2, 3};
        final int[] expectedResult = {4, 2, 4, 2, 3};
        final var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[] prices = {1, 2, 3, 4, 5};
        final int[] expectedResult = {1, 2, 3, 4, 5};
        final var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[] prices = {10, 1, 1, 6};
        final int[] expectedResult = {9, 0, 1, 6};
        final var result = solution.finalPrices(prices);
        assertThat(result).isEqualTo(expectedResult);
    }
}