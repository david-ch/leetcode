package davidch.leetcode.challenges.n1046;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[] stones = {2, 7, 4, 1, 8, 1};
        final var result = solution.lastStoneWeight(stones);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example_2() {
        final int[] stones = {1};
        final var result = solution.lastStoneWeight(stones);
        assertThat(result).isEqualTo(1);
    }
}