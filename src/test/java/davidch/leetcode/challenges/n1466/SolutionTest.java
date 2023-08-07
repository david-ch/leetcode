package davidch.leetcode.challenges.n1466;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        final var result = solution.minReorder(6, connections);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example_2() {
        final int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        final var result = solution.minReorder(5, connections);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example_3() {
        final int[][] connections = {{1, 0}, {2, 0}};
        final var result = solution.minReorder(6, connections);
        assertThat(result).isEqualTo(0);
    }
}