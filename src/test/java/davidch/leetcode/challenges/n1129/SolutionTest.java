package davidch.leetcode.challenges.n1129;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] redEdges = {{0, 1}, {1, 2}};
        final int[][] blueEdges = {};
        final int[] expectedResult = {0, 1, -1};
        final var result = solution.shortestAlternatingPaths(3, redEdges, blueEdges);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] redEdges = {{0, 1}};
        final int[][] blueEdges = {{2, 1}};
        final int[] expectedResult = {0, 1, -1};
        final var result = solution.shortestAlternatingPaths(3, redEdges, blueEdges);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[][] redEdges = {{0, 1}, {1, 2}, {3, 4}};
        final int[][] blueEdges = {{0, 3}, {4, 1}};
        final int[] expectedResult = {0, 1, 4, 1, 2};
        final var result = solution.shortestAlternatingPaths(5, redEdges, blueEdges);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_4() {
        final int[][] redEdges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        final int[][] blueEdges = {{1, 2}, {2, 3}, {3, 1}};
        final int[] expectedResult = {0, 1, 2, 3, 7};
        final var result = solution.shortestAlternatingPaths(5, redEdges, blueEdges);
        assertThat(result).isEqualTo(expectedResult);
    }
}