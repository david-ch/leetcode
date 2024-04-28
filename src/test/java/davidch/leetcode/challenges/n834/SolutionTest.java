package davidch.leetcode.challenges.n834;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void example_1() {
        final int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}};
        final var result = solution.sumOfDistancesInTree(6, edges);
        final int[] expectedResult = {8, 12, 6, 10, 10, 10};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_2() {
        final int[][] edges = {};
        final var result = solution.sumOfDistancesInTree(1, edges);
        final int[] expectedResult = {0};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_3() {
        final int[][] edges = {{1, 0}};
        final var result = solution.sumOfDistancesInTree(2, edges);
        final int[] expectedResult = {1, 1};
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void example_4() {
        final int[][] edges = {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}, {5, 6}};
        final var result = solution.sumOfDistancesInTree(7, edges);
        final int[] expectedResult = {11, 16, 8, 12, 12, 11, 16};
        assertThat(result).isEqualTo(expectedResult);
    }
}