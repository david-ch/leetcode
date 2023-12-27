package davidch.leetcode.challenges.n1578;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] neededTime = {1, 2, 3, 4, 5};
        final var result = solution.minCost("abaac", neededTime);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[] neededTime = {1, 2, 3};
        final var result = solution.minCost("abc", neededTime);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void example_3() {
        final int[] neededTime = {1, 2, 3, 4, 1};
        final var result = solution.minCost("aabaa", neededTime);
        assertThat(result).isEqualTo(2);
    }
}