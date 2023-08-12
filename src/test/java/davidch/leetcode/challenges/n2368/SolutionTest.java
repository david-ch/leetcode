package davidch.leetcode.challenges.n2368;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] edges = {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}};
        final int[] restricted = {4, 5};
        final var result = solution.reachableNodes(7, edges, restricted);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void example_2() {
        final int[][] edges = {{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}};
        final int[] restricted = {4, 2, 1};
        final var result = solution.reachableNodes(7, edges, restricted);
        assertThat(result).isEqualTo(3);
    }
}