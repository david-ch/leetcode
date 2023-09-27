package davidch.leetcode.challenges.n1615;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] roads = {{0, 1}, {0, 3}, {1, 2}, {1, 3}};
        final var result = solution.maximalNetworkRank(4, roads);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[][] roads = {{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}};
        final var result = solution.maximalNetworkRank(5, roads);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_3() {
        final int[][] roads = {{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        final var result = solution.maximalNetworkRank(8, roads);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void example_4() {
        final int[][] roads = {};
        final var result = solution.maximalNetworkRank(2, roads);
        assertThat(result).isEqualTo(0);
    }
}