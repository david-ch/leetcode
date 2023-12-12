package davidch.leetcode.challenges.n322;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] coins = {1, 2, 5};
        final var result = solution.coinChange(coins, 11);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] coins = {2};
        final var result = solution.coinChange(coins, 3);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void example_3() {
        final int[] coins = {1};
        final var result = solution.coinChange(coins, 0);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_4() {
        final int[] coins = {3, 4, 5};
        final var result = solution.coinChange(coins, 11);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_5() {
        final int[] coins = {3, 4, 5};
        final var result = solution.coinChange(coins, 7);
        assertThat(result).isEqualTo(2);
    }
}