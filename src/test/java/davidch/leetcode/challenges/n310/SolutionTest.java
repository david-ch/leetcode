package davidch.leetcode.challenges.n310;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
        final var result = solution.findMinHeightTrees(4, edges);
        assertThat(result).containsExactlyInAnyOrder(1);
    }

    @Test
    void example_2() {
        final int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        final var result = solution.findMinHeightTrees(6, edges);
        assertThat(result).containsExactlyInAnyOrder(3, 4);
    }

    @Test
    void example_3() {
        final int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {3, 4}, {0, 5}, {0, 6}, {4, 7}, {3, 8}, {6, 9}, {1, 10}, {10, 11}, {9, 12}, {2, 13}, {10, 14}, {12, 15}, {4, 16}};
        final var result = solution.findMinHeightTrees(17, edges);
        assertThat(result).containsExactlyInAnyOrder(0);
    }
}