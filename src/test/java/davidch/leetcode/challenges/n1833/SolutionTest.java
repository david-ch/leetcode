package davidch.leetcode.challenges.n1833;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] costs = {1, 3, 2, 4, 1};
        final var result = solution.maxIceCream(costs, 7);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[] costs = {10, 6, 8, 7, 7, 8};
        final var result = solution.maxIceCream(costs, 5);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] costs = {1, 6, 3, 1, 2, 5};
        final var result = solution.maxIceCream(costs, 20);
        assertThat(result).isEqualTo(6);
    }
}