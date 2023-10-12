package davidch.leetcode.challenges.n1962;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] piles = {5, 4, 9};
        final var result = solution.minStoneSum(piles, 2);
        assertThat(result).isEqualTo(12);
    }

    @Test
    void example_2() {
        final int[] piles = {4, 3, 6, 7};
        final var result = solution.minStoneSum(piles, 3);
        assertThat(result).isEqualTo(12);
    }
}