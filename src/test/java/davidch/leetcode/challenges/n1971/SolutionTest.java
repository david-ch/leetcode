package davidch.leetcode.challenges.n1971;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        final var result = solution.validPath(3, edges, 0, 2);
        assertThat(result).isTrue();
    }

    @Test
    void example_2() {
        final int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        final var result = solution.validPath(6, edges, 0, 2);
        assertThat(result).isTrue();
    }

    @Test
    void example_3() {
        final int[][] edges = {{0, 7}, {0, 8}, {6, 1}, {2, 0}, {0, 4}, {5, 8}, {4, 7}, {1, 3}, {3, 5}, {6, 5}};
        final var result = solution.validPath(10, edges, 5, 7);
        assertThat(result).isTrue();
    }
}