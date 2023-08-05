package davidch.leetcode.challenges.n547;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        final var result = solution.findCircleNum(isConnected);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_2() {
        final int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        final var result = solution.findCircleNum(isConnected);
        assertThat(result).isEqualTo(3);
    }
}